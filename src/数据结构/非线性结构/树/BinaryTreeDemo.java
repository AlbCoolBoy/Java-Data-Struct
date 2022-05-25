package 数据结构.非线性结构.树;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();


    }



}

class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }
    public void setRoot(Node node){
        this.root=node;
    }

    public void preorder() {
        if (this.root != null) {
            this.root.preorder();
        } else {
            System.out.println("二叉树为空");
        }
    }

    public void inorder() {
        if (this.root != null) {
            this.root.inorder();
        } else {
            System.out.println("二叉树为空");
        }
    }

    public void postorder() {
        if (this.root != null) {
            this.root.postorder();
        } else {
            System.out.println("二叉树为空");
        }
    }

    public Node create(Node node) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        if(number==-1){
            return null;
        }else{
            Node head=new Node();
            if(count==1){
                this.root=head;
            }
            create(head.left);
            create(head.right);
            return head;
        }

    }


}

class Node {
    private int number;
    public Node left;
    public Node right;

    public Node() {

    }

    public Node(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                '}';
    }

    public void preorder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preorder();
        }
        if (this.right != null) {
            this.right.preorder();
        }
    }

    public void inorder() {
        if (this.left != null) {
            this.left.inorder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.inorder();
        }
    }

    public void postorder() {
        if (this.left != null) {
            this.left.postorder();
        }
        if (this.right != null) {
            this.right.postorder();
        }
        System.out.println(this);
    }
}





































