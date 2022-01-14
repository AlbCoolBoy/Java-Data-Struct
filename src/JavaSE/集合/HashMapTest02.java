package JavaSE.集合;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
* 同时重写hashcode和equals，必须同时重写
* 并且如果equals返回的是true,那么hashcode返回的也必须是true
*
* HashMap的key值是可以为null的，但是只能有一个为null*/
public class HashMapTest02 {
    public static void main(String[] args) {
        Student student1=new Student("Justin");
        Student student2=new Student("Justin");
        System.out.println(student1.equals(student2));

        System.out.println("student1's hashcode:"+student1.hashCode());
        System.out.println("student2's hashcode:"+student2.hashCode());

        Set<Student> studentSet=new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        System.out.println(studentSet.size());  //只有在这里进行hashcode的重写，才不会存入两个内容相同的对象的引用，这是因为不进行重写的话，调用的是Object中的hashcode方法，只要对象的内存地址不同，得到的hashcode值就是不同的
    }
}
class Student{
    String name;

    public Student() {
    }

    public Student(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    //equals和hashcode的重写是可以IDEA自动生成的，但是手撕也不难，boolean的判断参数设定为需要的就行
}
