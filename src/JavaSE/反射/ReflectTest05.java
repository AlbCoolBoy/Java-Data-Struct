package JavaSE.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*反编译一个类的构造方法*/
public class ReflectTest05 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class userclass = Class.forName("JavaSE.反射.User");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Modifier.toString(userclass.getModifiers()));
        stringBuilder.append(" class ");
        stringBuilder.append(userclass.getSimpleName());
        stringBuilder.append("{\n");

        Constructor[] constructor = userclass.getDeclaredConstructors();
        for (Constructor con : constructor) {
            stringBuilder.append("\t");
            stringBuilder.append(Modifier.toString(userclass.getModifiers()));
            stringBuilder.append(" ");
            stringBuilder.append(userclass.getSimpleName());
            stringBuilder.append("(");  //再这里面拼接参数列表
            Class[] parameterTypes = con.getParameterTypes();
            for (Class paramater : parameterTypes) {
                stringBuilder.append(paramater.getSimpleName());        //返回参数列表中所有的数据类型
                stringBuilder.append(",");
            }
            if (parameterTypes.length > 0) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            stringBuilder.append(")");
            stringBuilder.append("{};");
            stringBuilder.append("\n");

        }
        stringBuilder.append("\n");
        stringBuilder.append("}");
        System.out.println(stringBuilder);

    }
}
