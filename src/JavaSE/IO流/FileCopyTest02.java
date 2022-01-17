package JavaSE.IO流;

import java.io.File;

//将一个文件夹拷贝到另一个根目录
public class FileCopyTest02 {
    public static void main(String[] args) {
        File srcfile=new File("E:\\Regfile");
        File destfile=new File("D:\\");
        copyDir(srcfile,destfile);
    }

    private static void copyDir(File srcfile, File destfile) {
        if(srcfile.isFile()){
            return ;
        }
        File[] files=srcfile.listFiles();
        for(File file:files){
            System.out.println(file.getAbsolutePath());
            copyDir(srcfile,destfile);
        }
    }
}
