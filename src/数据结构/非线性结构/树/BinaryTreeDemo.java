package 数据结构.非线性结构.树;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();


    }
}
class BinaryTree{                           //二叉树类
    private Node root;

    public void setRoot(Node node){         //二叉树的根节点
        this.root=node;
    }
    //前序遍历
    public void preorder(){
        if(this.root==null){
            System.out.println("二叉树为空");
        }else{
            this.root.preorder();
        }

    }
    //中序遍历
    public void inorder(){
        if(this.root==null){
            System.out.println("二叉树为空");
        }else{
            this.root.inorder();
        }
    }
    //后序遍历
    public void postoreder(){
        if(this.root==null){
            System.out.println("二叉树为空");
        }else{
            this.root.postorder();
        }
    }
    //前序查找
    public Node PreorderSearch(int number){
        if(root!=null){
            return root.preorderSearch(number);
        }else{
            System.out.println("二叉树为空");
            return null;
        }
    }
    //中序查找
    public Node InorderSearch(int number) {
        if (root != null) {
            return root.inorderSearch(number);
        } else {
            System.out.println("二叉树为空");
            return null;
        }
    }
    //后序查找
    public Node PostorderSearch(int number){
        if(root!=null){
            return root.postorderSearch(number);
        }else{
            System.out.println("二叉树为空");
            return null;
        }
    }


}
class Node{                          //二叉树中的结点
    private int number;
    private String name;
    private Node left;
    private Node right;
    public Node(int number,String name){
        this.name=name;
        this.number=number;
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


    //前序遍历
    public void preorder(){
        System.out.println(this);//线输出父节点
        if(this.left!=null){
            this.left.preorder();
        }
        if(this.right!=null){
            this.right.preorder();
        }

    }
    //中序遍历
    public void inorder(){
        if(this.left!=null){
            this.left.inorder();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.inorder();
        }
    }
    //后序遍历
    public void postorder(){
        if(this.left!=null){
            this.left.postorder();
        }
        if(this.right!=null)
        {
            this.right.postorder();
        }
        System.out.println(this);
    }

    //前序查找,通过递归实现，分别对左右子树进行查找
    public Node preorderSearch(int number) {
        Node resultnode = null;
        if (this.number == number) {
            return this;
        }

        if(this.left!=null){
            resultnode=this.left.preorderSearch(number);
        }
        if(resultnode!=null){
            return resultnode;
        }
        if(this.right!=null){
            resultnode=this.right.preorderSearch(number);
        }
        return resultnode;
    }

    //中序查找
    public Node inorderSearch(int number){
        Node resultnode=null;
        if(this.left!=null){
            resultnode=this.left.inorderSearch(number);
        }if(resultnode!=null){
            return resultnode;
        }
        if(this.number==number){
            return this;
        }
        if(this.right!=null){
            resultnode=this.right.inorderSearch(number);
        }
        return resultnode;
    }
    //后序查找
    public Node postorderSearch(int number){
        Node resultnode=null;
        if(this.left!=null){
            resultnode=this.left.postorderSearch(number);
        }
        if(resultnode!=null){
            return resultnode;
        }
        if(this.right!=null){
            resultnode=this.right.postorderSearch(number);
        }
        if(resultnode!=null){
            return resultnode;
        }
        if(this.number==number){
            return this;
        }
        return resultnode;
    }
}


