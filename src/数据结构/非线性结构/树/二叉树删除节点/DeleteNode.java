package 数据结构.非线性结构.树.二叉树删除节点;


/*
 * 如果删除的是叶子节点，就直接删除*/
public class DeleteNode {

}

class BinaryTree {
    private TreeNode root;                      //根节点

    public void setRoot(TreeNode node) {         //二叉树的根节点
        this.root = node;
    }

    public void delNode(int number) {
        if(this.root!=null){
            if(root.getNumber()==number){
                root=null;
            }else{
                root.delNode(number);
            }
        }else{
            System.out.println("二叉树为空");
        }
    }

    //前序遍历
    public void preorder() {
        if (this.root == null) {
            System.out.println("二叉树为空");
        } else {
            this.root.preorder();
        }
    }

    //中序遍历
    public void inorder() {
        if (this.root == null) {
            System.out.println("二叉树为空");
        } else {
            this.root.inorder();
        }
    }

    //后序遍历
    public void postoreder() {
        if (this.root == null) {
            System.out.println("二叉树为空");
        } else {
            this.root.postorder();
        }
    }


}

class TreeNode {
    private int number;
    private String name;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int number, String name) {
        this.name = name;
        this.number = number;
    }

    //仍然是使用递归的方式进行节点的删除
    public void delNode(int number) {
        if (this.left != null && this.left.number == number) {
            this.left = null;
            return;
        }
        if (this.right != null && this.right.number == number) {
            this.right = null;
            return;
        }
        if (this.left != null) {
            this.left.delNode(number);
        }
        if (this.right != null) {
            this.right.delNode(number);
        }
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

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    //前序遍历
    public void preorder() {
        System.out.println(this);//线输出父节点
        if (this.left != null) {
            this.left.preorder();
        }
        if (this.right != null) {
            this.right.preorder();
        }

    }

    //中序遍历
    public void inorder() {
        if (this.left != null) {
            this.left.inorder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.inorder();
        }
    }

    //后序遍历
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