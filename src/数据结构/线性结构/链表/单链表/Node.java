package 数据结构.线性结构.链表.单链表;

public class Node {
    private int data;
    public Node next;
    public Node(int data)
    {
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}
