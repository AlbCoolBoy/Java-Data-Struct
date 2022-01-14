package JavaSE.IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//文件字节输出流，负责写文件，从内存到硬盘
//
//
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream file=null;
        try {
            //这里的文件不一定真的是要选择已经存在的文件，如果输入的文件名不存在会自动新建一个文件
            //这种方式会将源文件先清空然后再将文件写入，谨慎使用
            //以追加的方式在文件末尾写入数据就不会清空源文件内容,只要在使用构造法方法的时候末尾添加true
            file=new FileOutputStream("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\写测试文件.txt",true);
            byte[] bytes={97,98,99,100};
            file.write(bytes);              //将byte数组全部写入文件

            file.write(bytes,0,3);  //将byte数组的一部分写入文件

            file.flush();                   //文件写完之后一定要记得刷新

            //对于直接输入一个字符串，只要将字符串转换为byte数组即可
            String s="\nHello world!";
            byte[] bytes1=s.getBytes();
            file.write(bytes1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
