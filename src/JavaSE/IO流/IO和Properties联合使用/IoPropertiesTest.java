package JavaSE.IO流.IO和Properties联合使用;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("D:\\ALB\\Java系统学习\\src\\JavaSE\\IO流\\IO和Properties联合使用\\userinfo.txt");
        Properties properties=new Properties();
        properties.load(fileInputStream);       //将文件中的信息加载到properties中,properties本身就是一个map集合，key和value均为String类


        System.out.println(properties.getProperty("username"));
        //这个性质再反射机制中使用的较多
    }
}
