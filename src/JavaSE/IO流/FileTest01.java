package JavaSE.IO流;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//File类不能完成文件的读写，指示文件和目录名的抽象表示，能够用来进行文件位置和是否存在的判断
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\Java File Test");
        System.out.println(file.exists());         //判断文件是否存在,上面新建的对象并不是在指定位置新建一个文件或文件夹

        if(!file.exists()){
            System.out.println("选择创建方式");
            System.out.println("1.以文件形式创建");
            System.out.println("2.以目录形式创建");
            Scanner input=new Scanner(System.in);
            int choice=input.nextInt();
            switch (choice){
                case 1:
                    file.createNewFile();       //以文件形式创建
                    break;
                case 2:
                    file.mkdir();               //以文件夹也就是目录形式创建

            }
        }
        File file1=new File("E:\\Java File Test");
        System.out.println(file1.getParent());


    }
}
