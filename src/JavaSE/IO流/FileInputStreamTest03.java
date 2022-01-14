package JavaSE.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream file=null;
        try {
            file=new FileInputStream("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\读测试文件.txt");
            byte[]  bytes=new byte[4];
            while(true){
                int read_data=file.read(bytes);
                if(read_data==-1){
                    break;
                }
                System.out.print(new String(bytes,0,read_data));    //并不是整个数组全部转换成String，而是读到多少个转换多少个
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(file!=null){
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
