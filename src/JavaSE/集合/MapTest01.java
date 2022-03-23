package JavaSE.集合;

import java.util.*;

/*
* Map和Collection没有继承关系
* Map通过key和value的键值对存储数据
* key和value存储的都是对象的内存地址
* Map接口中常用的方法
*   1、void clear()                                清空集合
*   2、boolean containsKey(Object Key)             是否包含某个键
*   3、boolean containsValue(Object value)         是否包含某个值
*   4、V get(Object Key)                           返回指定键对应的值
*   5、boolean isEmpty()                           判断集合是否为空
*   6、Set<K> keySet()                             获取Map中的所有的Key,在HashSet中，其中的add方法实际上在底层创建了一个HashMap,然后将添加的值添加到Key的位置
*   7、V put(K key,V value)                        向Map集合中添加键值对
*   8、int size()
*   9、V remove(Key key)                           通过key删除整个键值对
*   10、Collection<V> values()                     将Map中所有的values返回到一个集合中
*   11、Set<Map.Entry<K,V>> entrySet()             将Map转换为Set
* */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        //功能测试
        String result=map.get(1);
        System.out.println(result);
        System.out.println(map.size());
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("D"));
        System.out.println(map.containsValue("E"));

        Collection c=map.values();      //获取map中所有键值，将其放进集合中
        Iterator it=c.iterator();
        while(it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }

        Set<Integer> keys=map.keySet();
        Iterator<Integer> it2= keys.iterator();
        while(it2.hasNext())
        {
            Integer key=it2.next();
            String values=map.get(key);
            System.out.println(key+" = "+values);
        }

        //利用EntrySet方法遍历键值对,这种方式效率比较高，适合数据量大的情况，即将map转换为set
        System.out.println("利用EntrySet方法遍历键值对");
        Set<Map.Entry<Integer,String>> set =map.entrySet();
        Iterator<Map.Entry<Integer,String>> it3= set.iterator();
        while(it3.hasNext()){
            Map.Entry<Integer,String> node=it3.next();
            System.out.println(node);
        }

    }
}
