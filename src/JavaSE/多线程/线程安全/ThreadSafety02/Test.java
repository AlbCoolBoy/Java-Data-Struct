package JavaSE.多线程.线程安全.ThreadSafety02;

public class Test {
    public static void main(String[] args) {
        Acount acount=new Acount("acount_01",10000);

        AcountThread thread1=new AcountThread(acount);
        AcountThread thread2=new AcountThread(acount);

        thread1.start();
        thread2.start();

    }
}
