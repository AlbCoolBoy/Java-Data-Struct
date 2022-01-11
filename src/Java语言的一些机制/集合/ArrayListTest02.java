package Java语言的一些机制.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
* ArrayList的构造方法：两种*/
public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();     //第一种无参构造，会自动初始化容量
        ArrayList list1=new ArrayList(100);     //含参构造，自己初始化容量

        Collection collection=new HashSet();
        collection.add(100);
        collection.add(200);
        collection.add(300);
        collection.add(400);
        ArrayList list2=new ArrayList(collection);  //这是Arraylist的第三种构造方法，能够将其他集合转换成ArrayList
        for(int i=0;i<list2.size();i++)
        {
            System.out.println(list2.get(i));
        }

    }
}
