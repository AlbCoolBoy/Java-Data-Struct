package JavaSE.IO流.遍历文件夹;

import java.io.File;

//使用递归遍历一下文件夹
public class Traverse {
    public static void main(String[] args) {
        File folder=new File("E:\\");
        getAllFile(folder);
    }


    private static void getAllFile(File folder) {
        File[] files=folder.listFiles();

       if(files!=null){
           for (File file : files) {
               if(file.isDirectory()){
                   getAllFile(file);
               }
               else{
                   System.out.println(file.getAbsolutePath());
               }
           }
       }

    }
}
