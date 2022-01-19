package JavaSE.IO流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterTest01 {
    public static void main(String[] args) throws IOException {
        Writer writer=new FileWriter("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\写测试文件02.txt",true);
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        bufferedWriter.write("hello wrold\n");
        bufferedWriter.write("Java IO");

        bufferedWriter.flush();
        bufferedWriter.close();



    }
}
