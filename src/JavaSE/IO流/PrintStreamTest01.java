package JavaSE.IO流;
//标准字节输出流，默认输出到控制台，标准输出流不需要手动关闭,即不需要调用close()方法

import javax.swing.plaf.FileChooserUI;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        //其实就是，这里是输出到控制台的，但是也可以将输出方向改变
        PrintStream ps=System.out;
        ps.println("hello world");

        //改变输出方向,输出到log文件中，就实现了一个简单的日志
        PrintStream printStream=new PrintStream(new FileOutputStream("log"));
        System.setOut(printStream);
        System.out.println("hello wrold");
        System.out.println("hello wrold");
        System.out.println("hello wrold");


    }
}
