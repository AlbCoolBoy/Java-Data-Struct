package JavaSE.IO流;

//使用缓冲流的时候不需要再使用byte数组了，他自带数组

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        Reader reader=new FileReader("D:\\ALB\\Java数据结构\\src\\JavaSE\\集合\\CollectionTest01.java");
        BufferedReader bufferedReader=new BufferedReader(reader);  //BufferedReader的构造方法中需要传递一个Reader类的实例对象

        //放一个流的构造方法中需要另一个流的时候，传递进来的流叫做节点流、
        //外部负责进行包装的流叫做包装流，或者是处理流


//        String first_line=bufferedReader.readLine();
//        System.out.println(first_line);
//
//        String second_line=bufferedReader.readLine();
//        System.out.println(second_line);

        String line=null;
        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }

        bufferedReader.close();         //在关闭bufferedreader的时候，在源代码中可以发现会自动关闭传递进来的节点流,所以只需要关闭最外层的流，内部的节点流会自动关闭
    }
}
//使用readLine方法进行文件读取效果比较好
