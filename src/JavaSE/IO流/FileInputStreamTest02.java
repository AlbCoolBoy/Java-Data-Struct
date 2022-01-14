package JavaSE.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 一次读取一个字节，内存和硬盘的交互太频繁，通过int read(byte[] b)方法来解决\
*这个方法能够一次读取b.length()个字节*/
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\读测试文件.txt");
            byte[] bytes=new byte[5];        //一次性最多能够读取数组长度个字节
            int file_read=file.read(bytes); //该read方法返回值是读到的字节的数量
            System.out.println(file_read);
            System.out.println(new String(bytes,0,file_read));  //并不是将数组全部转换成字符串，二是读取了多少个字节才转换多少
            file_read=file.read(bytes);
            System.out.println(new String(bytes,0,file_read));
            file_read=file.read(bytes);
            System.out.println(new String(bytes,0,file_read));
            file_read=file.read(bytes);
            System.out.println(new String(bytes,0,file_read));
            file_read=file.read(bytes);
            System.out.println(new String(bytes,0,file_read));
            file_read=file.read(bytes);
            System.out.println(new String(bytes,0,file_read));



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
