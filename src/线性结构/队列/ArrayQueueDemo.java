package 线性结构.队列;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        //队列数据结构的功能测试
        ArrayQueue queue = new ArrayQueue(10);
        System.out.println("先创建一个队列");
        System.out.println("输入要入队列的数据个数");
        int total;
        Scanner input = new Scanner(System.in);
        total = input.nextInt();
        System.out.println("请输入数据");
        for (int i = 0; i < total; i++) {
            int cin = input.nextInt();
            queue.EnQueue(cin);
        }
        ;
        queue.Traverse();

        System.out.println("1：添加数据入队");
        System.out.println("2：数据出队");
        System.out.println("3：显示队列中数据");

        while (true) {
            System.out.println("选择要进行的操作：");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("输入要添加的数值");
                    int add = input.nextInt();
                    queue.EnQueue(add);
                    break;
                case 2:
                    System.out.println(queue.OutQueue());
                    break;
                case 3:
                    System.out.println("队列现有数据如下：");
                    queue.Traverse();
                    break;

            }
        }
    }
}

class ArrayQueue {
    private int maxsize;
    private int front;
    private int rear;
    private int[] array;

    public ArrayQueue(int maxsize) {     //创建队列的构造器
        this.maxsize = maxsize;
        array = new int[this.maxsize];
        front = -1;           //队列头指针，指向队列头部
        rear = -1;            //队列尾指针，指向队列尾
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return (front == rear && front == -1);
    }

    //判断队列是否满
    public boolean isFull() {
        return rear == maxsize - 1;
    }


    //数据入队列
    public void EnQueue(int value) {
        if (isFull()) {
            System.out.println("队列已满，无法添加");
            return;
        }
        rear = rear + 1;
        array[rear] = value;
    }

    //数据出队列,取数据是从队头取出数据
    public int OutQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据返回");  //这里因为是要返回一个int型的数值，如果返回一个设定的值，可能会和实际问题中的数值发生冲突，不如直接抛出异常
        }
        front++;
        return array[front];
    }

    //显示队列所有数据
    public void Traverse() {
        if (isEmpty()) {
            System.out.println("队列为空，无数据遍历");
            return;
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    //返回队列头的数据
    public int GetHead() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，队列头没有数据");
        }
        return array[front + 1];
    }

}















































