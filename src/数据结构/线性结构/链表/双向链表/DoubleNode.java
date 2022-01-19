package 数据结构.线性结构.链表.双向链表;

public class DoubleNode {
    private int data;
    public DoubleNode next;
    public DoubleNode pre;

    public DoubleNode(int data)
    {
        this.data=data;
    }
    public int getData()
    {
        return data;
    }
    public void setData(int data)
    {
        this.data=data;
    }
}
