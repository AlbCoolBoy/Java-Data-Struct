package JavaSE.多线程;

//线程优先级

public class ThreadTest09 {
    public static void main(String[] args) {
        Thread6 thread6=new Thread6();
        Thread t=new Thread(thread6);

       /* System.out.println("最高优先级"+Thread.MAX_PRIORITY);
        System.out.println("最低优先级"+Thread.MIN_PRIORITY);
        System.out.println("默认优先级"+Thread.NORM_PRIORITY);

        System.out.println("main线程优先级"+Thread.currentThread().getPriority());      //获取当前线程优先级
*/
        t.setPriority(10);
        t.start();
        Thread.currentThread().setPriority(1);
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }


    }
}
class Thread6 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}