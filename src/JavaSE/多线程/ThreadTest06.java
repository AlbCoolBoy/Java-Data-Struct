package JavaSE.多线程;

import java.util.Scanner;

//唤醒一个正在睡眠的线程
public class ThreadTest06 {
    public static void main(String[] args) throws InterruptedException {
        Thread3 thread3=new Thread3();
        Thread t=new Thread(thread3);

        t.start();      //睡眠时间一年的ke'yi线程开始运行，但是可以再利用主线程的睡眠，设定任意时间将睡眠一年的线程唤醒
        int time;
        Scanner input=new Scanner(System.in);
        System.out.print("几秒后唤醒线程？： ");
        time= input.nextByte();
        Thread.sleep(time*1000);
        t.interrupt();
        //这种中断睡眠的方式依靠的是Java的异常处理机制，调用这个方法后
        //下面的sleep方法就会出异常，然后结束try并输出异常

    }
}
class Thread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("分支线程开始睡眠-->>");
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException interruptedException) {

        }
        System.out.println("分支线程结束睡眠-->>");

    }
}
//子类重写父类的方法，子类不能抛出比父类更宽泛的异常，如果有异常需要进行处理，只能try catch ，不能抛出