package JavaSE.多线程.线程安全.ThreadSafety02;

public class AcountThread extends Thread{
    private Acount acount;
    public AcountThread(Acount acount){
        this.acount=acount;
    }

    public void run(){
        acount.withdraw(5000);
    }

}
