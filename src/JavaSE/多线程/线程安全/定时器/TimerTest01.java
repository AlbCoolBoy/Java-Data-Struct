package JavaSE.多线程.线程安全.定时器;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest01 {
    public static void main(String[] args) throws ParseException {
        Timer timer=new Timer();

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firsttime=sdf.parse("2022-1-23 14:52:23");

        timer.schedule(new LogTimerTask(),firsttime,1000*10); //period是程序运行的间隔时间

    }

}
class LogTimerTask extends TimerTask{
    public void run(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strtime=sdf.format(new Date());
        System.out.println(strtime+"完成了一次数据备份");
    }
}
