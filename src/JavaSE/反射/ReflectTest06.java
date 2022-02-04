package JavaSE.反射;
/*获取一个指定类的父类和其已经实现的接口*/
public class ReflectTest06 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class userclass=Class.forName("java.lang.String");
        //获取String的父类
        String father=userclass.getSuperclass().getSimpleName();
        System.out.println(father);

        //获取String类实现的所有接口
        Class []interfaces= userclass.getInterfaces();      //返回值为一个class数组，因为一个类可以实现多个接口
        for(Class interfase:interfaces){
            System.out.println(interfase.getName());
        }
    }
}
