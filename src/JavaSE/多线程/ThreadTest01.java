package JavaSE.多线程;

import java.lang.management.ThreadInfo;

public class ThreadTest01 {
    public static void main(String[] args) {
        Threadone threadone=new Threadone();
        threadone.start();
        for(int i=0;i<1000;i++){
            System.out.println("主线程--->>>"+i);
        }

    }
}
class Threadone extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程————>>>"+i);
        }

    }
}