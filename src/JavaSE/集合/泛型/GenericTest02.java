package JavaSE.集合.泛型;

import java.util.ArrayList;
import java.util.List;

/*
* JDK引入了：自动类型推断机制
* */
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList里面的类型可以省略了，因为从JDK8以后会自动推断
        List<Animal> list=new ArrayList<>();
        //同样在进行迭代器的获取的时候，也会进行类型判断
    }

}
