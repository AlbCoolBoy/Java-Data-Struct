package JavaSE.集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* 在使用HashMap的时候，放在key部分的元素默认要进行equals方法的重写，因为Object中equals方法默认比较的是内存地址
* 但是在实际问题中比较的应该是内容
* 同样hashcode 也要进行重写，并且重写hashcode的时候要尽量让哈希表散列均匀，才能尽量最大化哈希表的效率
*
* HashMap的默认初始化容量是16，默认加载因子是0.75
* 默认加载因子是指当hashMap底层数组的容量达到75%的时候，数组开始扩容*/
public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Justin Bibber");
        map.put(2,"Jason");
        map.put(3,"Karls");
        map.put(4,"Spider");
        map.put(4,"Swift");             //key重复了，所以之前的会被覆盖

        System.out.println(map.size());
        Set<Map.Entry<Integer,String>> dictionary=map.entrySet();
        Iterator<Map.Entry<Integer,String>> it=dictionary.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> m=it.next();
            System.out.println(m);
        }
    }

}

//放在hashmap集合key中的元素以及放在hashset集合中的元素必须要同时重写hashcode和equals方法