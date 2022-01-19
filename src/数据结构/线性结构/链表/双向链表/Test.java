package 数据结构.线性结构.链表.双向链表;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();

        for (int i = 0; i < 5; i++) {
            list.AddNode();
        }
        list.Traverse();
        list.DeleteNode(2);
        list.Traverse();
    }
}
