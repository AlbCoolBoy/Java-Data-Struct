package JavaSE.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//文件复制的操作:使用FileInputStream和FileOutputStream进行文件的复制，因为要先将文件从硬盘读取到内存，再从内存写到硬盘
//文件内容随便，什么样的文件都能进行复制
//这个方法还只能拷贝复制文件并不能拷贝复制文件夹或者目录
public class FileCopyTest01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;

        try{
            //创建输入流对象，用于读取要复制的文件
            fis=new FileInputStream("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\写测试文件.txt");
            //创建输出对象，用于写一个新的文件
            fos=new FileOutputStream("D:\\写测试文件.txt");

            byte[] bytes=new byte[1024*1024];       //每次最多复制一Mb
            int read_data=0;
            while((read_data=fis.read(bytes))!=-1){
                fos.write(bytes,0,read_data);
            }



            fos.flush();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
