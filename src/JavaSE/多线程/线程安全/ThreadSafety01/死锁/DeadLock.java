package JavaSE.多线程.线程安全.ThreadSafety01.死锁;
//在开发中synchronized尽量不要嵌套使用，很容易出现线程死锁的问题
public class DeadLock {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();

        Thread t1=new MyThread1(o1,o2);
        Thread t2=new MyThread2(o1,o2);

        t1.start();
        t2.start();
    }

}
class MyThread1 extends Thread{
    Object object1;
    Object object2;
    public MyThread1(Object object1,Object object2){
        this.object1=object1;
        this.object2=object2;
    }
    public void run(){
        synchronized (object1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            synchronized (object2){

            }

        }
    }

}

class MyThread2 extends Thread{
    Object object1;
    Object object2;
    public MyThread2(Object object1,Object object2){
        this.object1=object1;
        this.object2=object2;
    }
    public void run(){
        synchronized (object2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            synchronized (object1){

            }
        }
    }

}
