package JavaSE.集合;

/*
* ArrayList
* 1、默认初始化容量是10，也就是使用构造方法的时候，源码中的默认容量就是10
* 2、底层是一个Object数组】、
*
* */
public class ArrayListTest01 {
    public static void main(String[] args) {

    }
}
/*
* 在Java1.8中，当添加数据导致容量不够的时候，根据底层代码，用到一个二进制的移位操作
* 会将ArrayList进行扩容，扩容后的容量是原容量的1.5倍
* */