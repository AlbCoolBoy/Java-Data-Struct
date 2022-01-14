package JavaSE.IO流;
//文件字节流，任何类型的文件都能进行读写


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = null;
        try {
            file = new FileInputStream("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\读测试文件.txt");
            int read_data = file.read();       //如果read()方法返回的的是-1就表示已经没有字节了,文段中的空格也是有阿斯克码值的
           while(read_data!=-1){
               System.out.println(read_data);
               read_data=file.read();
           }



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
