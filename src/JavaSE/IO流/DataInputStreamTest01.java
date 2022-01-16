package JavaSE.IO流;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest01 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis=new DataInputStream(new FileInputStream("D:\\ALB\\Java数据结构\\src\\JavaSE\\IO流\\data"));

        byte b=dis.readByte();
        short s=dis.readShort();
        int i=dis.readInt();
        long l=dis.readLong();
        float f=dis.readFloat();
        boolean bo=dis.readBoolean();
        char c=dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(bo);
        System.out.println(c);

    }
}
