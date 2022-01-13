package JavaSE.集合;

import java.util.ArrayList;
import java.util.Collection;

/*
* contains方法
* */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        String s1="abc";
        collection.add(s1);
        String s2="cde";
        collection.add(s2);

        System.out.println(collection.contains("abc")); //contains方法底层进行String数据类型的比较的时候调用了equals方法，不在乎地址，只用比较字符串

    }
}
class dmo04{

}