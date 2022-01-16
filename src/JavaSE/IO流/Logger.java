package JavaSE.IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

//使用PrintStream制作一个简单的日志
public class Logger {
    public static void log(String message){
        try {
            PrintStream out=new PrintStream(new FileOutputStream("log.txt",true));
            System.setOut(out);
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time=sdf.format(date);
            System.out.println(time+":"+message);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
