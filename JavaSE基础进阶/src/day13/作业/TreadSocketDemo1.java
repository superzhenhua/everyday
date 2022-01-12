package day13.作业;


import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class TreadSocketDemo1 implements Runnable {
    private Socket accept;
    public TreadSocketDemo1(Socket accept) {
        this.accept = accept;
    }
    BufferedOutputStream bos =null ;
    @Override
    public void run() {
        try {
            //创建一个网络中的流接收数据
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            //创建本地流,将数据存入本地文件中并做永久保存
            bos = new BufferedOutputStream(new FileOutputStream("D:\\workspace\\zhenhua_code\\JavaSE基础进阶\\123\\" + UUID.randomUUID().toString() + "jpg"));
            //将数据进行读写
            int a;
            while ((a = bis.read()) != -1) {
                bos.write(a);
            }
            //对结果进行反馈
            //创建一个网络中的字符输出流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bw.write("上传成功");
            bw.flush();
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关流
            if(accept!=null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           if (bos!=null){
               try {
                   bos.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

        }
    }
}
