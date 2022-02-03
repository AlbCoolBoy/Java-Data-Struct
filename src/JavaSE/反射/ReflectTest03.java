package JavaSE.反射;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*通过反射机制实例化一个想要的对象，相比于创痛的实例化对象的方式，非常的灵活*/
public class ReflectTest03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        FileInputStream fileInputStream=new FileInputStream("D:\\ALB\\Java系统学习\\src\\JavaSE\\反射\\properties");
        Properties properties=new Properties();
        properties.load(fileInputStream);

        fileInputStream.close();

        String classname=properties.getProperty("classname");
        Class class1=Class.forName(classname);
        Object obj=class1.newInstance();
        System.out.println(obj);

    }
}
/*实例化目标对象的时候， 不需要重写代码，只需要将配置文件中的文件名改为需要使用的文件名即可*/