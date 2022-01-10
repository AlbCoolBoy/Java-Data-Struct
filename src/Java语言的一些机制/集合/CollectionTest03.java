package Java语言的一些机制.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/*
* 仍然是集合的遍历/迭代
* */
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(100);
        collection.add("hello");
        collection.add(new Date());

        Iterator it = collection.iterator();  //存进集合的数据类型和输出的类型是一样的，只不过打印的时候是打印成字符串型的
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj instanceof Integer) {
                System.out.println("返回的是Integer类型");
            } else {
                System.out.println(it + "返回的不是Integer类型");
            }
        }

    }

}
class demo03{

}
