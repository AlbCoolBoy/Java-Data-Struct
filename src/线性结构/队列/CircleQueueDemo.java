package 线性结构.队列;

import java.util.Scanner;

//实现一个循环队列
//循环队列中的有效的数据个数是 (rear+maxsize-front)%maxsize
public class CircleQueueDemo {
    public static void main(String[] args) {
        CircleQueue queue=new CircleQueue(20);
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
                    System.out.println(queue.GetHead());
                    break;
                case 3:
                    System.out.println("队列现有数据如下：");
                    queue.Traverse();
                    break;
            }
        }
    }
}
class CircleQueue{
    int maxsize;
    int front;
    int rear;
    int [] array;

    public CircleQueue(int maxsize){
        this.maxsize=maxsize;
        array=new int[this.maxsize];
        front=0;
        rear=0;
    }

    public boolean isEmpty(){
        return front==rear;
    }

    public boolean isFull(){
        return (rear+1)%maxsize==front;
    }

    //循环队列中，rezr指向最后一个元素的后面一个位置
    public void EnQueue(int value){
        if(isFull()){
            System.out.println("队列已满，无法加入数据");
            return ;
        }else{
            array[rear]=value;
            rear=(rear+1)%maxsize;
        }
    }
    //
    public int GetHead(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，无法返回任何数据");
        }else{
            int result=array[front];
            front=(front+1)%maxsize;
            return result;
        }

    }
    //无论是处理尾指针和头指针，再进行后移的时候，都要记得进行取模运算，因为循环队列是可能出现尾指针或头指针超出maxsize的情况
    public void Traverse(){
        if(isEmpty()){
            System.out.println("队列为空，不能返回任何数据");
            return ;
        }else{
            for(int i=front;i<front+returnsize();i++){
                System.out.print(array[i]+"  ");
            }
            System.out.println();
        }

    }
    public int returnsize(){
        return (rear+maxsize-front)%maxsize;
    }
}
