package 数据结构.非线性结构.树.线索化二叉树;

public class ThreadBinaryTreeDemo {
    public static void main(String[] args) {

        Node root=new Node(1,"root");
        Node node1=new Node(2,"node1");
        Node node2=new Node(3,"node2");
        Node node3=new Node(4,"node3");
        Node node4=new Node(5,"node4");
        Node node5=new Node(6,"node5");
        Node node6=new Node(7,"node6");

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node2.setLeft(node5);
        node2.setRight(node6);

        ThreadBinaryTree tree=new ThreadBinaryTree();
        tree.setRoot(root);
        tree.threadedNodes();

        Node right = node1.getRight();
        System.out.println(right);


    }

}

class ThreadBinaryTree{
    private Node root;
    private Node pre;   //总是保留前一个结点，作为前驱结点使用
    public void setRoot(Node node){
        this.root=node;
    }

    public void threadedNodes(){
        this.threadedNodes(root);
    }
    public void threadedNodes(Node node){
//        if(node==null){
//            System.out.println("无法进行线索化");
//            return;
//        }

        //先线索化左子树
        threadedNodes(node.getLeft());
        //处理当前结点
        if(node.getLeft()==null){
            node.setLeft(pre);          //如果当前结点的左子树为空，就可以放他的左指针指向pre，也就是他的前驱结点
            node.setLeftType(1);        //这时候左指针是用来指向前驱的，所以type设置为1
        }

        //处理后继结点
        if(pre!=null&&pre.getRight()==null){        //pre!=null的条件非常重要，因为其为空的时候，是不能设置他的后继的
            pre.setRight(node);
            pre.setRightType(1);
        }
        pre=node;
        //再线索化右子树
        threadedNodes(node.getRight());

    }
}


class Node {
    private int number;
    private String name;
    private Node left;
    private Node right;

    private int leftType;       //0表示指向左子树，1表示指向前驱结点
    private int rightType;      //0表示指向右子树，1表示指向后继结点


    public Node(int numbre, String name) {
        this.number = numbre;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public void preorder(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preorder();
        }
        if(this.right!=null){
            this.right.preorder();
        }
    }

    public void inorder(){
        if(this.left!=null){
            this.left.inorder();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.inorder();
        }
    }

    public void postorder(){
        if(this.left!=null){
            this.left.postorder();
        }
        if(this.right!=null){
            this.right.postorder();
        }
        System.out.println(this);
    }
}

