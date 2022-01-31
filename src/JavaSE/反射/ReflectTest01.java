package JavaSE.反射;

import java.util.Date;

/*要操作字节码文件，首先就要获取类的字节码文件,有三种方式获取字节码文件
 * 一、通过Class类的静态方法forName（）进行获取，静态方法中传递的参数是一个字符串并且必须是一个完整的类名，完整类名必须带有包名
 * 二、JDK中任何对象中都有一个方法叫getClass，通过该方法获取字节码文件
 * 三、Java语言中任何一种类型包括基本数据类，都包括.class属性，通过该属性获取字节码文件*/
public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("java.lang.String");


        String s = "abcdefg";
        Class get = s.getClass();
        System.out.println(c1 == get);

        Class c2=String.class;
        Class c3= Date.class;
    }
}
