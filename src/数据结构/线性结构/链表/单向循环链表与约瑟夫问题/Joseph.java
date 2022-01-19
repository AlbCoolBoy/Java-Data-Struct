package 数据结构.线性结构.链表.单向循环链表与约瑟夫问题;

import java.util.Scanner;

/*
* 创建单向循环链表的步骤：
* 设置一个first结点，就让他等于第一个结点
* 再设置一个temp临时结点，每添加一个结点就将temp等于新添加的结点
* 每个新添加的结点的next也是要指向first的
* 同样，遍历的结束判定条件就是结点的next指针是否指向first
* */

public class Joseph {
    public static void main(String[] args) {
        CircleList circleList = new CircleList();
        int number;
        System.out.println("要添加的数据的个数");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        circleList.add(number);
        circleList.count(1,2,5);

    }
}
class CircleList{                        //Joseph中的环
    Node first=new Node(-1);
    public void add(int number)          //number为要创建得到结点的数量
    {
        if(number<1){
            System.out.println("数据错误");
        }
        Node temp=null;                 //辅助临时节点
        for(int i=1;i<=number;i++){     //创建一个joseph环，只有第一个结点需要进行单独考虑
            Node node=new Node(i);
            if(i==1){
                first=node;             //将第一个结点设为first
                first.setNext(first);
                temp=first;
            }else{
                temp.setNext(node);
                node.setNext(first);
                temp=node;
            }

        }
    }
    public void ShowNode(){
        //先进行判空
        if(first==null){
            System.out.println("环为空，没有任何结点");
            return ;
        }
        Node temp=first;
        while(true){
            System.out.println("编号"+temp.getNumber());
            if(temp.getNext()==first){
                break;
            }
            temp=temp.getNext();
        }
    }
    public void count(int start_number,int countnumber,int nums){
        if(first==null||start_number<1||start_number>nums){
            System.out.println("输入有误");
            return ;
        }
        Node temp=first;
        while(true){
            if(temp.getNext()==first){
                break;
            }
            temp=temp.getNext();
        }
        for(int j=0;j<start_number-1;j++){
            first= first.getNext();
            temp=temp.getNext();
        }
        while(true){
            if(temp==first){
                break;
            }
            for(int j=0;j<countnumber-1;j++){
                first= first.getNext();
                temp=temp.getNext();
            }
            //上面的循环结束后，first指向的结点就是要出去的结点
            System.out.println("结点"+first.getNumber()+"出圈");
            first=first.getNext();
            temp.setNext(first);
        }
        System.out.println("最后的圈中结点是"+temp.getNumber());
    }



}
class Node{                 //Joseph中的结点，含编号
    private int number;
    private Node next;
    public Node(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
