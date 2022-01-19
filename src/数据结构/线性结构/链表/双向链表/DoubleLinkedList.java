package 数据结构.线性结构.链表.双向链表;

import java.util.Scanner;

public class DoubleLinkedList {
    private DoubleNode head=new DoubleNode(0);

    //尾插法
    public void AddNode(int data)
    {
        DoubleNode addNode=new DoubleNode(data);
        DoubleNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=addNode;
        addNode.pre=temp;
    }
    //尾插法
    public void AddNode()
    {
        int data;
        System.out.println("enter data:");
        Scanner input=new Scanner(System.in);
        data=input.nextInt();
        DoubleNode temp=head;
        DoubleNode addNode=new DoubleNode(data);
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=addNode;
        addNode.pre=temp;

    }

    //删除固定位置的结点
    public void DeleteNode(int position)
    {
        if(head.next==null)
        {
            System.out.println("list is empty");
            return ;
        }
        int count=0;
        DoubleNode temp=head;
        while(count!=position-1)
        {
            temp=temp.next;
            count++;
        }
        //开始删除
        temp.next.next.pre=temp;
        temp.next=temp.next.next;
    }

    //遍历
    public void Traverse()
    {
        if(head.next==null)
        {
            System.out.println("list is empty");
            return ;
        }
        DoubleNode temp=head.next;
        while(temp!=null)
        {
            System.out.print(temp.getData()+"⇆");
            temp=temp.next;
        }
        System.out.println();
    }



}
