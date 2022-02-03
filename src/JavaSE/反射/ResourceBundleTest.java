package JavaSE.反射;

import java.util.ResourceBundle;

/*资源绑定器*/
public class ResourceBundleTest {
    public static void main(String[] args) {
        //绑定的资源文件不用添加文件的后缀
        //可以使用资源绑定器存储要实例化的对象，这是最正规的方法
        ResourceBundle resourceBundle=ResourceBundle.getBundle("db");
        String classname=resourceBundle.getString("classname");
        System.out.println(classname);
    }
}
