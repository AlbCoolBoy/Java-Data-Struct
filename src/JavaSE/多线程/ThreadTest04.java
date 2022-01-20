package JavaSE.多线程;
//获取当前线程对象，获取线程名字
//修改线程名字
public class ThreadTest04 {
    public static void main(String[] args) {
        MyThread thread1=new MyThread();        //使用这个方法要记得先创建可实例化一个可运行对象
        Thread t=new Thread(thread1);

        //获取当前线程对象，使用静态方法 static Thread CurrentThread()
        Thread getreturn=Thread.currentThread();        //该方法在main方法中调用所以返回的就是主线程
        System.out.println(getreturn.getName());

        t.setName("线程一");
        String name=t.getName();
        System.out.println(name);
        t.start();

        //没有set线程名字的时候，线程名字默认都是Thread-0,Thread-1,Thread-3
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread getreturn=Thread.currentThread();
            System.out.println(getreturn.getName()+i);
            //若是想返回当前线程的名字，只用this关键字和super关键字也可以
        }
    }
}
