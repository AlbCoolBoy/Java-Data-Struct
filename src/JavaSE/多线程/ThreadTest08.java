package JavaSE.多线程;

import java.util.Scanner;

//合理的终止一个线程
//下面是终止一个线程比较合理的方式
//使用一个boolean值做标记，想要终止线程的时候直接将boolean的值改变就行
public class ThreadTest08 {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("几秒后终止线程: ");
        int time;
        Scanner input=new Scanner(System.in);
        time= input.nextInt();

        Thread5 thread5=new Thread5();
        Thread t=new Thread(thread5);
        t.start();
        Thread.sleep(1000*time);

        thread5.run=false;




    }
}
class Thread5 implements Runnable{
    boolean run=true;

    public void run(){
        for (int i = 0; i < 100; i++) {
            if(run) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
            else {
                return ;
            }
        }


    }
}