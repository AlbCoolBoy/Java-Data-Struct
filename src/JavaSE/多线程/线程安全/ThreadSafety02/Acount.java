package JavaSE.多线程.线程安全.ThreadSafety02;

public class Acount {
    private String number;
    private double balance;

    public Acount() {
    }

    public Acount(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(double money){
        //这里将synchronized放在实例方法上也是可以的，但是这里锁定的默认就是this。可能会导致后面代码块过多，效率降低
        //

        double before=this.balance;
        double after=before-money;
        this.balance=after;
    }
}
