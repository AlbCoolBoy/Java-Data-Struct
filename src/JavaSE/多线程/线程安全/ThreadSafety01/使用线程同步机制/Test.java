package JavaSE.多线程.线程安全.ThreadSafety01.使用线程同步机制;

public class Test {
    public static void main(String[] args) {
        Acount acount=new Acount("acount_0",10000);

        Thread thread1=new AcountThread(acount);
        Thread thread2=new AcountThread(acount);

        thread1.setName("thread1");
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}

//Java中的三大变量
//实例变量：存储在堆中
//静态变量：存储在方法区中
//局部变量：存储在栈中
//在Java中，局部变量永远不会存在线程安全的问题，因为局部变量存储在栈中，栈中的数据永远不共享
//实例变量在堆中，静态变量在方法区中，堆和方法去都只有一个，都是数据共享，所以会出现线程安全问题

//静态方法也可以使用synchronized，这时候是类锁。
