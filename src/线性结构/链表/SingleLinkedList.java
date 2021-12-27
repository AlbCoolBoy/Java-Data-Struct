package 线性结构.链表;

//实现单链表的所有基本操作
public class SingleLinkedList {
    public static void main(String[] args) {

    }
}
class Node {
    public int number;
    public String name;
    public Node next;   //指针域
    public Node() {
    };
    public Node(int number, String name) {
        number = this.number;name = this.name;
    }
}
class LInkedLinst{
    private Node head=new Node(-1," ");
    public boolean Same(Node node1,Node node2)          //使用这个函数的目的是后面就不同
    {
      if(node1.number== node2.number&&node1.name== node2.name)
      {
          return true;
      }return false;
    }
    public void AddNode(Node node) {
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }
    public void DelectNode(Node node)
    {
        Node temp=head;
        while(Same(temp,node))
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.next=null;
    }
    public void Traverse()
    {
       if(head.next==null)
       {
           System.out.println("链表为空");
           return ;
       }
        Node temp=head.next;
       while(temp!=null)
       {
           System.out.println(temp.number+" "+ temp.name);
           System.out.println();
           temp=temp.next;
       }

    }
    public void InsertNode(Node node)
    {

    }



}

