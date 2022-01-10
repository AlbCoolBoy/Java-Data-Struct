package Java语言的一些机制.集合;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/*
*   关于集合的遍历/迭代
*   该文件中的遍历/迭代方法在Map集合中不能使用，但是在所有的Collection其他的子类中都能使用
* */
public class CollectionTest02 {
    public static void main(String[] args) {
        //先创建一个集合对象并添加一定的数据
        Collection collection=new HashSet();
        collection.add(100);
        collection.add(120);
        collection.add(200);
        collection.add(300);
        collection.add("hello world");
        collection.add(new Date());
        collection.add(new demo02());

        //对集合进行遍历/迭代
        //1.获取集合对象的迭代器对象,iterator方法就是用于返回一个迭代器的
        Iterator iterator= collection.iterator();
        //2.通过以上获得的迭代器对象开始遍历迭代集合
        /*
        *迭代器对象有以下方法
        * bollean hasNext() 如果仍有元素可以迭代，就返回true
        * Object next() 返回迭代的下一个元素
        * */
        while(iterator.hasNext()){
            Object obj= iterator .next();    //iterator一开始就不是指向集合的第一个元素的，是指向集合之前的地址
            System.out.println(obj);
        }


    }
}
class demo02{

}