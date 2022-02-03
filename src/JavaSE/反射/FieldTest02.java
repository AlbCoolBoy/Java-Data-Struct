package JavaSE.反射;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//通过反射机制返回一个类的所有的属性，即反编译
public class FieldTest02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class userclass=Class.forName("java.lang.String");
        Field field[]=userclass.getDeclaredFields();

        StringBuilder stringBuilder=new StringBuilder();    //创建字符串拼接对象用于反编译的时候拼接字符串
        stringBuilder.append(Modifier.toString(userclass.getModifiers())+" class "+userclass.getSimpleName()+"{");
        stringBuilder.append("\n");
        for(Field fields:field){
            stringBuilder.append("\t");
            stringBuilder.append(Modifier.toString(fields.getModifiers()));
            stringBuilder.append(" ");
            stringBuilder.append(fields.getType().getSimpleName());
            stringBuilder.append(" ");
            stringBuilder.append(fields.getName());
            stringBuilder.append(";");
            stringBuilder.append("\n");

        }
        stringBuilder.append("}");
        System.out.println(stringBuilder);
    }
}
