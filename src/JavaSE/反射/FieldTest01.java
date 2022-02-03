package JavaSE.反射;

import java.lang.reflect.Field;
//获取一个指定类中的属性，
public class FieldTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c=Class.forName("JavaSE.反射.User");
        Field field[]=c.getFields();        //只返回public

        System.out.println(field.length);

        Field f=field[0];
        System.out.println(f.getName());

        Field field1[]=c.getDeclaredFields();   //返回所有属性的字段
        System.out.println(field1.length);
        for (Field fields:field1){
            System.out.println(fields.getType().getSimpleName()+" "+fields.getName());  //返回属性的数据类型和名字
        }
    }
}
