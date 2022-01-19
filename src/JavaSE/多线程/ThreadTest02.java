package JavaSE.多线程;

public class ThreadTest02 {
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();     //创建一个可运行的对象
        Thread t=new Thread(myRunnable);            //将可运行对象封装成一个线程对象

        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->>>"+i);
        }


    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->>>"+i);
        }

    }
}