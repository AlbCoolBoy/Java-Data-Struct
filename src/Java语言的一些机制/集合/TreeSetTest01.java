package Java语言的一些机制.集合;

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");

        for(String element:ts){             //可以使用迭代器进行迭代，也可以使用foreach进行循环遍历，这里使用循环遍历更快
            System.out.println(element);
        }

    }
}
