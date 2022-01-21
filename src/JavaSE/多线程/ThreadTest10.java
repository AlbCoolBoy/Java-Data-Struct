package JavaSE.多线程;

//让位方法yield()

public class ThreadTest10 {
    public static void main(String[] args) {
        Thread7 thread7=new Thread7();
        Thread t=new Thread(thread7);

        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }


    }
}
class Thread7 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            if(i%100==0)
            {
                Thread.yield();
            }
        }

    }
}
