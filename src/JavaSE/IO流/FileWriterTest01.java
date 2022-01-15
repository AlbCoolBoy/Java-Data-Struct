package JavaSE.IO流;

import java.io.FileWriter;
import java.io.IOException;

//问价输出字符流，只能写普通文件
public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter out=null;
        try {
            out=new FileWriter("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\写测试文件2.txt",true);

            //可以直接




            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
