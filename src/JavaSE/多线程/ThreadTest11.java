package JavaSE.多线程;

//合并线程
public class ThreadTest11 {
    public static void main(String[] args) throws InterruptedException {
        Thread8 thread8=new Thread8();
        Thread t=new Thread(thread8);

        System.out.println("main begin");

        t.start();
        t.join();       //将线程合并到当前线程，会导致当前线程受阻塞，main线程一定最后结束

        System.out.println("main over");


    }
}
class Thread8 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }

    }
}
