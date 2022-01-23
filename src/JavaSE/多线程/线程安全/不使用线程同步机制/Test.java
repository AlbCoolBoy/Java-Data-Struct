package JavaSE.多线程.线程安全.不使用线程同步机制;
//不使用线程同步机制，有可能会发生线程冲突，但是如果增加上睡眠的话，一定会冲突
public class Test {
    public static void main(String[] args) {
        Acount acount=new Acount("acount_0)",10000);

        //创建两个线程，两个线程能够共享同一个账户
        Thread thread1=new AcountThread(acount);
        Thread thread2=new AcountThread(acount);

        thread1.setName("thread1");
        thread2.setName("thread2");

        thread1.start();
        thread2.start();






    }
}
