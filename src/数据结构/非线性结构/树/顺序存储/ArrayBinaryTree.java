package 数据结构.非线性结构.树.顺序存储;

/*
* 数组存储方式和树的存储方式可以互相转换
* 可以将树以数组的形式存储数据，只不过这个数组仍然能实现二叉树的三种遍历方式
* 这种利用数组存储二叉树的方式就是顺序存储二叉树
*
* 顺序存储二叉树的特点：
* 顺序存储二叉树通常只考虑完全二叉树
* 第n个元素的左子结点为2*n+1
* 第n个元素的右子结点为2*n+2
* 第n个元素的父节点为（n-1）/2
* */
public class ArrayBinaryTree {
    public static void main(String[] args) {
        int array[]=new int[10];
        int count=1;
        for (int i = 0; i < 10; i++) {
            array[i]=count;
            count=count+1;
        }

        ArrayTree tree=new ArrayTree(array);
        tree.preOrder(0);
    }
}
class ArrayTree{
    private int[] array;

    public ArrayTree(int[] array) {
        this.array = array;
    }

    public void preOrder(int index){
        if(array==null){
            System.out.println("数组为空，没有数据输出");
        }
        System.out.println(array[index]);
        if(index*2+1<array.length){
            preOrder(index*2+1);
        }
        if(index*2+2<array.length){
            preOrder(index*2+2);
        }
    }

    public void inOrder(int index){
        if(array==null){
            System.out.println("数组为空，没有数据输出");
        }
        if(index*2+1<array.length){
            inOrder(index*2+1);
        }
        System.out.println(array[index]);
        if(index*2+2<array.length){
            inOrder(index*2+2);

        }
    }

    public void postOrder(int index){
        if(array==null){
            System.out.println("数组为空，没有数据输出");
        }
        if(index*2+1<array.length){
            postOrder(index*2+1);
        }
        if(index*2+2<array.length){
            postOrder(index*2+2);
        }
        System.out.println(array[index]);
    }
}
