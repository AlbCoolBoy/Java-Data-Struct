package JavaSE.多线程;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Scanner;

//强行终止线程,强行终止线程不合理，内存中未保存的数据会丢失
public class ThreadTest07 {
    public static void main(String[] args) throws InterruptedException {
        Thread4 thread4=new Thread4();
        Thread t=new Thread(thread4);
        t.start();
        Scanner input=new Scanner(System.in);
        int time=input.nextInt();
        System.out.println("几秒后强行终止");
        Thread.sleep(time*1000);
        // t.stop();   //该方法已经过时,因为会丢失未保存的数据





    }
}
class Thread4 implements Runnable{
    public void run(){
        System.out.println("分支线程开始睡眠");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println("分支线程被强行终止");

    }
}
