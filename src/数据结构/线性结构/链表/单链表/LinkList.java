package 数据结构.线性结构.链表.单链表;

import java.util.Scanner;
//实现单链表的基本操作：头插，尾插，删除，遍历
public class LinkList {
    private Node head=new Node(1);

    //尾插
    public void AddNode(int data)
    {
        Node addnode=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=addnode;
        addnode.next=null;      //处理空指针
    }
    //尾插
    public void AddNode()
    {
        int data;
        System.out.println("enter data: ");
        Scanner input=new Scanner(System.in);
        data=input.nextInt();
        Node addnode=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=addnode;
        addnode.next=null;      //处理空指针

    }
    //头插法
    public void input(Node node)
    {
        Node temp=head;
        node.next=temp.next.next;
        temp.next=node;
    }


    public void DeleteNode(int position)    //删除指定位置，也就是第几个结点
    {
        if(head.next==null)
        {
            System.out.println("list is empty");
        }
        int count=0;
        Node temp=head;
        while(count!=position-1)
        {
            temp=temp.next;
            count++;
        }
        //开始删除
        temp.next=temp.next.next;
    }

    public void Traverse()
    {
        if(head.next==null)         //判空
        {
            System.out.println("list is empty");
            return ;
        }
        Node temp=head.next;
        while(temp!=null)
        {
            System.out.print(temp.getData()+"———>");
            temp=temp.next;
        }
        System.out.println();
    }

}
