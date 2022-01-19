package JavaSE.IO流.序列化的模拟和实现;

import java.io.*;
//参与进行序列化的对象必须要实现Serializable接口，否则不支持序列化
public class OutputStreamTest01  {
    public static void main(String[] args) throws IOException {
        Student student=new Student(10,"Justin");
        //序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("studednts"));

        //序列化对象
        oos.writeObject(student);

        oos.flush();
        oos.close();
    }
}
class Student implements Serializable{      //只有需要进行序列化的对象实现Serializable接口后，再能进行序列化
    private int number;
    private String name;

    public Student() {
    }

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

}
