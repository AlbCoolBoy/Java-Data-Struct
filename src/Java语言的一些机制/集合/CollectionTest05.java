package Java语言的一些机制.集合;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection  collection=new ArrayList();
        User user1=new User("Justin");
        User user2=new User("Justin");
        collection.add(user1);
        System.out.println(collection.contains(user2));
        //contains方法底层调用了equals方法，如果User类中不重写equals方法的话，会直接调用Object类中的equals方法，
        //而查看Object类的源码就会发现，Object类中的equals方法是直接比较内存地址
        //在下面的类中重写了equals方法之后，比较的就是内容了

    }
}
class User{
    String name;
    public User(){};
    public User(String name){
        this.name=name;
    }
    //这里面并没有重写equals方法，多以在进行对象比较的时候，是直接比较内存地址的，所以上面会返回false
    //如果在这里调用equals方法的话，上面再进行contains方法比较的时候会，一定会直接调用user类中的equals方法

    @Override
    public boolean equals(Object obj) {
        if(obj==null|!(obj instanceof User)){
            return false;
        }
        if(obj==this){
            return true;
        }
        User u=(User)obj;
        return u.name.equals(this.name);
        //重写equals方法的步骤：
        //1.先进行对象是否为空和对象是否是目标类的判断（即使用instenseof进行判断）
        //2.如果obj==this,就可以直接返回true；
        //设定自定义的boolean值返回条件

    }
}
