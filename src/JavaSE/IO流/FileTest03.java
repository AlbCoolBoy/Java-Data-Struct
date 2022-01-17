package JavaSE.IO流;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        //获取当前目录下的所有子目录的方法 listfile
        File file=new File("C:\\Windows");
        File[] files=file.listFiles();
        for(File f:files){
            System.out.println(f.getAbsolutePath()+"  "+file.getName());
        }


    }
}
