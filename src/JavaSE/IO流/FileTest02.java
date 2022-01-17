package JavaSE.IO流;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File file=new File("D:\\ALB\\Java数据结构\\src\\JavaSE\\帮助文档PDF\\BufferedReader.pdf") ;
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.lastModified());        //这里的输出值是1970年到现在的总毫秒数
        Date time=new Date(file.lastModified());
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String stringtime=simpleDateFormat.format(time);
        System.out.println(stringtime);                     //文件的最后一次修改时间
        System.out.println("文件大小为: "+file.length()/1024+"kb");   //默认单位是字节

    }
}
