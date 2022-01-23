package JavaSE.多线程.线程安全.不使用线程同步机制;

public class Acount {
    private String number;  //银行账户
    private double balance;    //余额

    public Acount(String number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    public Acount() {
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

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(double money) throws InterruptedException {
        double before = this.balance;
        double after = before - money;

        Thread.sleep(0);     //如果在这里添加一个睡眠时间，那么两个线程一定会冲突
        this.balance = after;

    }

}
