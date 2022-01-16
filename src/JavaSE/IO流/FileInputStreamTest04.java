package JavaSE.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
*
* FileInputStream其他常用方法
*
* */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream file=null;
        try {


            file=new FileInputStream("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\读测试文件.txt");
            int read=file.available();
            System.out.println(read);





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
