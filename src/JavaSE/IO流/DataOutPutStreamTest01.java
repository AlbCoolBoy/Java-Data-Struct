package JavaSE.IO流;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//数据专属输出流
//这个流将数据和数据类型一同写入文件中
//这个文件并不是普通文件，用记事本无法打开
//想要读取这个文件只能使用DataInputStream,并且读取的顺序应该要和输入的顺序相同
public class DataOutPutStreamTest01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\data2");
        DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);

        byte b=100;
        short s=12;
        int i=1;
        long l=400l;
        float f=3.2f;
        boolean bo=false;
        char c='a';

        dataOutputStream.writeByte(b);
        dataOutputStream.writeShort(s);
        dataOutputStream.writeInt(i);
        dataOutputStream.writeLong(l);
        dataOutputStream.writeFloat(f);
        dataOutputStream.writeBoolean(bo);
        dataOutputStream.writeChar(c);




        dataOutputStream.flush();
        dataOutputStream.close();

    }
}
