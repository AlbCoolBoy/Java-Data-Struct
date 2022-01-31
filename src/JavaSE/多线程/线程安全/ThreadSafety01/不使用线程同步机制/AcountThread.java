package JavaSE.多线程.线程安全.ThreadSafety01.不使用线程同步机制;

public class AcountThread extends Thread{

    private Acount acount;              //这样的话两个对象能够共享同一个账户

    public AcountThread(Acount acount){
        this.acount=acount;
    }

    public void run(){
        double money=5000;
        try {
            acount.withdraw(money);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" 取款成功，账户余额是 "+acount.getBalance());
    }

}
