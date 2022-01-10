package Java语言的一些机制.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
* Collection接口中的常用方法
*   1.Collection中能够存放的元素
*       使用泛型之前，Collection中能够存储Object中的所有子类型
*        使用了泛型之后，只能存储某个具体的类型
*   2.常用方法
*       bollean add(Object o)       向集合中添加元素
*       int size()                  获取集合中元素的个数
*       void clear()                清空集合中的数据
*       bollean contains(Object o)  判断当前集合中是否包含元素o
*       boolean remove(Object o)    删除集合中某个元素
*       boolean isEmpty()           判断集合是否为空，即元素个数是否为
*       Object[] toArray()          将集合转换为数组
*   3.集合的迭代(使用迭代器) 见CollectionTest02
* */


public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象,接口是抽象的，不能实例化对象
        Collection collection=new ArrayList();
        collection.add(100); //这里使用了自动装箱，实际上放进去的不是一个int型的数据，而是放进去一个对象的地址Integer c=new Integer(100)
        collection.add(new Date());
        collection.add(new demo());
        System.out.println(collection.size());
        collection.add("hello world");      //和上面一样，这里也是是用了自动装箱

        collection.add(120);
        collection.add(130);
        Object[] obj=collection.toArray();  //将集合转换为数组,并且还能进行遍历，如果集合中是一个对象的话就会输出他的内存地址
        for (int i = 0; i < obj.length; i++) {
            Object o=obj[i];
            System.out.println(o);
        }
    }
}
class demo{

}
