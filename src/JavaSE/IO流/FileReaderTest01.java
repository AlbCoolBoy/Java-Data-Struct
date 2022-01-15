package JavaSE.IO流;
//以字符形式进行文件操作,所以只能读取普通文本
//读取文件的时候比较方便

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader reader=null;
        try {
            reader=new FileReader("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\读测试文件.txt");
            char[] chars=new char[4];
            int read_count=0;
            while((read_count=reader.read(chars))!=-1){
                System.out.print(new String(chars,0,read_count));
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
