package Java语言的一些机制.集合;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/*
*  底层是一个数组
* 初始化容量10，每进行一次默认的扩容之后，容量是之前的2倍
*vector所有的方法都是线程同步的，都带有synchronized关键字,是线程安全的
*效率很低，使用的比较少了
*   如何将线程不安全的ArrayList集合转换为线程安全的集合：使用集合工具类：java.util.Collections
*   注意L:java.util.Collection 是集合接口
*        java.util.Collections 是集合工具类
*
* */
public class VectorTest01 {
    public static void main(String[] args) {
        List v=new Vector(); //vector是线程安全的，但是效率不高并不常使用，所以可以将ArrayList转换为线程安全


        List list=new ArrayList(10);
        Collections.synchronizedList(list);     //该方法就能将ArrayList对象转换为线程安全的
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(340);
        list.add(15);
    }
}
