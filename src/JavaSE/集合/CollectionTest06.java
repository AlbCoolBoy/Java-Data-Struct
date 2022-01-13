package JavaSE.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
* 迭代器的获取时机和集合的状态是相关的，集合结构发生改变之后，必须重新获取迭代器
* 如果集合结构发生改变但是迭代器没有更新，就会抛出异常： java.util.ConcurrentModificationException
*
* *********：因此在进行集合元素的迭代的时候不能调用remove方法删除集合元素，因为删除一个元素，集合的状态就发生了改变
*            但是可以在遍历的时候使用迭代器进行删除
* */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();

        collection.add(1);
        collection.add(2);
        collection.add(3);

        Iterator it=collection.iterator();
        while(it.hasNext()){
            Object obj =it.next();
            it.remove();        //这个就是使用迭代器进行删除，使用迭代器进行删除的时候会自动更新迭代器和集合
            System.out.println(obj);
        }
        System.out.println(collection.size());
    }
}
