package JavaSE.多线程.线程安全.ThreadSafety01.使用线程同步机制;

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

    public void withdraw(double money) {
        //如果要使用线程同步机制保证不发生冲突，下面的方法只能使用线程排队
        //必须一个线程结束后另一个线程才能进来
        //使用synchronized关键字进行线程排队，其中括号中的参数就是允许进行共享的数据，比如这里允许进行共享的数据就是acount
        synchronized (this) {
            double before = this.balance;
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            this.balance = after;
        }       //synchronized中的代码块越小效率越高

    }
}
//执行原理：在Java语言中，每个对象都有一把锁
//假设t1,t2线程并发，开始执行以下代码的时候，一定有一个先一个后的顺序
//假设t1先执行了，遇到了synchronized，就会自动寻找后面共享数据的对象的对象锁，找到后就占有这把锁，知道同步代码块执行结束才会解锁
