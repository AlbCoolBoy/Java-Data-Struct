package JavaSE.多线程;
//线程休眠,放弃占有的CPU时间片，将时间片让给其他线程
//在哪个线程调用就睡眠哪个线程
public class ThreadTest05 {
    public static void main(String[] args) {
        Thread2 thread2=new Thread2();
        Thread thread=new Thread(thread2);
        thread.setName("sleep_test");
        thread.start();

    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        Thread thread=Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(thread.getName()+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}
