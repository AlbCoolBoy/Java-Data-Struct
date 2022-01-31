package JavaSE.反射;
/*通过反射实例化对象*/
public class ReflectTest02 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class class1=Class.forName("JavaSE.反射.User");
        Object obj=class1.newInstance();
        System.out.println(obj);
    }
}
/*要注意的是：
* 通过反射机制进行对象的实例化的时候，会调用对象的无参构造方法，必须要保证对象的无参构造存在
* 即使是空，也要声明无参构造*/
