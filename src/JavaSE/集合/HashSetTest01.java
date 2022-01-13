package JavaSE.集合;

import java.util.HashSet;
import java.util.Set;

/*
* HashSet集合特点：
*   1、存储顺序和取出顺序不同
*   2、不可重复
*   3、放到HashSet集合中的元素实际上是放到KashMap的Key中了
* */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("justin");
        set.add("bibber");
        set.add("jason");

    }
}
