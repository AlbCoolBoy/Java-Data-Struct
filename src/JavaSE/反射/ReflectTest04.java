package JavaSE.反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*重点：通过反射机制调用方法*/
public class ReflectTest04 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class userclass=Class.forName("JavaSE.反射.User");
        Object obj=userclass.newInstance();

        //获取方法，决定一个方法的是方法名和参数列表，获取方法的时候只要确定好方法名和参数列表就行
        Method method=userclass.getDeclaredMethod("run", int.class, String.class);
        //调用方法，首先是调用方法的四要素
        //对象
        //方法名
        //实参列表
        //返回值e
        method.invoke(obj,18,"justin");
        //使用invoke方法调用并执行目的方法

    }
}
