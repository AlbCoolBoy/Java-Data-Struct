package JavaSE.多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//通过实现Callable接口实现线程
public class ThreadTest13 {
    public static void main(String[] args) {
        //首先创建一个未来任务类对象
        FutureTask futureTask=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception { //call方法相当与线程中的run方法，只不过这个方法有返回值
                System.out.println("call method begin");
                Thread.sleep(1000*5);
                System.out.println("call method over");
                int a=100;
                int b=200;
                return a+b;

            }
        });

        //FutureTask中需要传递一个Callable返回值的对象，所以可以通过匿名内部类解决

        Thread thread=new Thread(futureTask);
        thread.start();




    }
}
