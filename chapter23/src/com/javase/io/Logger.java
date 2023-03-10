package com.javase.io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Logger {
    public  static  void log(String msg){
        //指向一个日志文件
        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream("log.txt",true));
        //改变输出方向
        System.setOut(out);
        //日期当前时间
        Date nowTime=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime =sdf.format(nowTime);
        System.out.println(strTime+":"+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
