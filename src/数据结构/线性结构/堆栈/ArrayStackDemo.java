package 数据结构.线性结构.堆栈;

import java.util.Scanner;
//使用数组模拟堆栈的本质
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack arrayStack=new ArrayStack(5);
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("enter number: ");
            int number=input.nextInt();
            arrayStack.Push(number);
        }
        arrayStack.Traverse();
        arrayStack.Pop();
        arrayStack.Traverse();
    }
}


//数组栈类
class ArrayStack {
    private int MaxSize;
    private int[] stack;
    private int top = -1;


    public ArrayStack(int MaxSize) {
        this.MaxSize = MaxSize;
        stack = new int[this.MaxSize];      //将堆栈定义为一个数组
    }

    public boolean isFulll() {
        return top == MaxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    //入栈
    public void Push(int value) {
        if (isFulll()) {
            System.out.println("stack is full,can not push any element");
            return;
        }
        top=top+1;
        stack[top] = value;

    }
    //出栈
    public int Pop() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return -32768;
        }
        int result=stack[top];
        top--;
        return result;
    }
    //遍历栈
    public void Traverse(){
        int mid=top;
        while(mid!=-1)              //此处不能直接改变top的值，应该设置一个中间变量，让其值等于top
        {
            System.out.print(stack[mid]+"  ");
            mid--;
        }
        System.out.println();
        System.out.println("traverse finished");
    }


}