package 数据结构.线性结构.链表.单链表;

public class Test {
    public static void main(String[] args) {
        LinkList list=new LinkList();
        for (int i = 0; i < 5; i++) {
            list.AddNode();
        }
        list.Traverse();
        list.DeleteNode(2);
        list.Traverse();
        Node node=new Node(9);
        list.input(node);
        list.Traverse();

    }
}

