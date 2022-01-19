package JavaSE.多线程;

public class ThreadTest03 {
    public static void main(String[] args) {

        //匿名内部类，在内部类中重写run方法
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程--->>>"+i);
                }


            }
        });

        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->>>"+i);
        }

    }
}
