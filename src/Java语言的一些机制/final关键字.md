## final关键字

1. final是一个关键字，表示最终的不可变的
2. final修饰的类无法继承
3. final修饰的方法无法被覆盖
4. final修饰得到变量一旦赋值以后，不能重新赋值
5. final修饰的引用一旦指向某一个对象之后不能再指向其他的对象，被指向的对象无法被垃圾回收器回收
6. final修饰的引用虽然指向某个对象之后不能再指向其他的对象，但是对象中的内存是可以修改的

JDK中的自带的String和其他相关的类再源代码中就是使用final进行修饰的，这样是为了开发者不能继承这样的工具类并对其作出修改。在自己的开发中，如果不希望某一个类被其他人继承，就可以将该类使用final进行继承

1. 实例变量有默认值，final定义的变量不能修饰，所以final修饰的变量不能使用系统的默认值，必须进行手动赋值

   ```java
   public class demo{
       final int number=10;		//这个赋值在构造方法执行过程中进行
       public static void main(String[] args){
           
       }
   }
   ```

2. 被final修饰的实例变量是不能变得，这种变量一般和static联合使用，成为"常量"

   常量的定义格式是 public static final 类型 常量名 = 值

   Java规范中要求常量名字全部大写，每个单词中间用下划线连接               

   ```java
   class Chinese{
   	static final String country="China";
   }
   ```

   