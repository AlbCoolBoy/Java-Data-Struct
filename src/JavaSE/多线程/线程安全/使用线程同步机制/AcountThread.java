package JavaSE.多线程.线程安全.使用线程同步机制;

public class AcountThread extends Thread{
    private Acount acount;
    public AcountThread(Acount acount){
        this.acount=acount;
    }

    public void run(){
        double money=5000;
        acount.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"取款成功，余额： "+acount.getBalance());
    }


}
