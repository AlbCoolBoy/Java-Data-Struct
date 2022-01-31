package JavaSE.多线程.线程安全.守护线程;

public class ThreadTest12  {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new BackDataThread();
        thread.setName("备份数据线程");


        thread.setDaemon(true); //将线程设置为守护线程
        thread.start();

        //只要将备份线程设置为守护线程，就能够让其在主线程结束的同时结束

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            Thread.sleep(1000);
        }

    }
}
class BackDataThread extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(Thread.currentThread().getName()+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }


        }
    }
}
