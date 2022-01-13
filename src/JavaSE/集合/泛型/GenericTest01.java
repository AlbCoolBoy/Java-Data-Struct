package JavaSE.集合.泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
* 泛型的优点：
*   一、集合中的数据类型得到同一
*   二、从集合中取出的元素类型是泛型指定的数据类型，不需要进行向下转型
*
* 泛型的缺点
*   一、集合中存储的元素缺乏多样性，不能再随机存取各种类型的元素了
*   二、调用子类型特有的方法的时候还是要向下转型的*/
public class GenericTest01 {
    public static void main(String[] args) {
        List<Animal> list=new ArrayList<Animal>();  //使用泛型可以来规定集合中存储的是什么类型的数据，比如在使用add方法的时候，就只能添加指定数据类型的数据
        Animal nick=new People();
        Animal jason=new People();
        Animal doggy=new Bitch();
        Animal pig=new Bitch();

        list.add(nick);
        list.add(jason);
        list.add(doggy);
        list.add(pig);

        //同样可以使用泛型来规定迭代器的数据类型
        Iterator<Animal> it=list.iterator();
        while(it.hasNext()){
            Animal one=it.next();       //只有在使用泛型之后，才可以使用非Object类获取迭代器，否则是只能使用Object实例化的对象获取迭代器
           if(one instanceof People){
               People p=(People) one;
               System.out.println(p);
           }else if(one instanceof Bitch){
               Bitch b=(Bitch)one;
               System.out.println(b);
           }
        }
    }
}
class Animal{

}
class People extends Animal{
    public People(){
        System.out.println("people");
    }
}
class Bitch extends Animal{
    public Bitch(){
        System.out.println("bitch");
    }
}
