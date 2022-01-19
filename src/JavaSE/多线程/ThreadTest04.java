package JavaSE.多线程;
//获取当前线程对象，获取线程名字
//修改线程名字
public class ThreadTest04 {
    public static void main(String[] args) {
        MyThread thread1=new MyThread();        //使用这个方法要记得先创建可实例化一个可运行对象
        Thread t=new Thread(thread1);

        String name=t.getName();


    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程1————>>"+i);
        }
    }
}
