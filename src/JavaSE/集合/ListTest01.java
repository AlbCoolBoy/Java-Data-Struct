package JavaSE.集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 测试List接口中的常用方法
* List集合存储元素的特点
*   1、有序：有下标
*   2、从0开,可重复
* List接口特有的方法
*   1、void add(int index,E element) 在指定位置添加数据
*   2、E get(int index)              返回指定位置的数据
*   3、int indexof(Object o)         返回指定对象第一次出现位置的索引，是第一次
*   4、int lastIndexOf(Object obj)
*   5、Object remove(int index)
*   6、Object set(int index,Object element)
* 其他的方法可以直接看文档
*/
public class ListTest01 {
    public static void main(String[] args) {
        List list=new ArrayList();

        list.add(1);                //默认就是尾插
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator it=list.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }

        for(int i=0;i<list.size();i++){
            Object obj=list.get(i);     //list特有的方法，能够返回指定位置的对象
            System.out.println(obj);
        }

    }


}
