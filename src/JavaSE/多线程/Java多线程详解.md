# Java多线程详解

## 线程的实现

### 一、继承Thread 

1. 创建一个新的类，让其继承Thread

2. 重写类中的run()方法

3. 在main方法中实例化这个类并调用start()方法，就调用了

   **start()方法：**

   **在JVM中开辟一个新的栈空间，这段代码执行完成，就瞬间结束了，这个方法使用的目的只是为了开辟新的空间，栈空间一旦开辟，线程就启动成功了，启动成功后会自动调用run()方法，run方法在分支栈的底部，main方法在主栈的底部，是平级的**

   **如果不调用start方法就直接调用run方法，不会创建一个新的线程，如果在main方法中调用的，还是在main栈中**

   ```java
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
   ```

   

### 二、实现Runnable接口

**创建一个可运行对象，然后将对象封装成一个线程类**

```java
public class ThreadTest03 {
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();     //创建一个可运行的对象
        Thread t=new Thread(myRunnable);            //将可运行对象封装成一个线程对象
        
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->>>"+i);
        }
        

    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程--->>>"+i); 
        }
        
    }
}
```

**优先使用实现Runnable接口的方式，因为如果以后还要继承其他的类的话，使用了上面的方法之后就不能再继承其他的类了**

### 三、使用匿名内部类

```java
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

```

匿名内部类就是这里的runnable接口并没有实例化一个有名字的对象，直接在内部new了一个接口，并实现了类的方法

## 线程生命周期

1. 新建状态：线程刚刚创建的状态
2. 就绪状态：就绪状态又叫可运行状态，表示当前的线程具有抢夺CPU时间片的权利也就是执行权。当一个线程抢夺到时间片之后就开始执行run()方法，run()方法的开始标志着线程进入运行状态
3. 运行状态：run()方法的开始标志着线程进入运行状态，当之前占有的CPU时间片用完，线程就会重新进入就绪状态，重新抢夺CPU时间片，当再次夺取到时间片，又会进入run方法接着上一次的代码继续执行
4. 线程阻塞：当线程遇到阻塞事件，比如用户键盘输入或是sleep方法等等，会从运行状态进入阻塞状态，阻塞状态的线程会放弃之前占有的CPU时间片
5. 线程死亡：线程运行结束

**Java规范并没有将正在运行的方法作为一个单独的状态，一个正在运行的线程仍然处于可运行状态**

**这种线程调度的方式叫做抢占式调度系统，目前的桌面以及服务器设备使用的都是抢占式调度系统，而大部分手机上使用的是协同式调度系统**


## 线程相关方法
1. getname()：获取当前线程
2. static Thread currentThread()：一个静态方法，返回当前线程对象，哪个正在运行的线程对象调用，返回的就是哪个线程对象



## 线程调度模型

**Java使用的是抢占式调度系统**

相关的方法

1. void setPriority(int newPriority) 设置线程的优先级

   线程优先级最低为1，默认为5，最高为10

2. int getPriority()  获取线程优先级

3. void join() 合并线程

4. static void yield() 让位方法，暂停正在执行的线程对象，并执行其他线程



## 线程安全⚠⚠⚠

**以后的项目开发中，项目都是运行服务器端，服务器端已经实现对线程的定义和线程对象的创建以及线程的启动。更重要的是程序是放在一个多线程的环境中运行的，更需要关心的是，在多线程并发的环境下，线程是否是安全的**

### 一、在并发中出现线程安全的情况

1. 多线程并发

2. 有共享数据

3. 共享数据有修改行为

   以上三点同时满足，就会存在线程安全问题



### 二、如何解决线程安全问题



### 三、守护线程

Java语言中线程分为两大类

1. 用户线程

2. 守护线程（后台线程）：**一般守护线程是一个死循环，所有的用户线程只要结束，守护线程自动结束**

   其中具有代表性守护线程就是垃圾回收线程



## 定时器

在实际开发中，每间隔特定的时间启动特定的程序时非常常见的，有多种解决方法，比如通过设置线程睡眠来设置时间间隔。但时在java中已经实现了一个定时器的类，可以直接使用定时器来设置间隔时间

但是在实际的开发中，也是很少用定时器的，因为在很多主流的框架中比如SpringTask,只要通过监督那配置就能完成定时器的任务









