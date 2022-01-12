package day13.作业2;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class TreadSocketDemo2 implements Runnable{
    private Socket accept;
    public TreadSocketDemo2(Socket accept) {
        this.accept=accept;
    }



    @Override
    public void run() {
        BufferedOutputStream bos=null;
        try {
            //创建网络中的输入流
            InputStream is = accept.getInputStream();
            BufferedInputStream bis =new BufferedInputStream(is);

            //创建缓存输出流,并将数据写入文本中
             bos =new BufferedOutputStream(new FileOutputStream("D:\\workspace\\zhenhua_code\\JavaSE基础进阶\\123\\"+ UUID.randomUUID().toString()+"jpg"));
            //读写操作
            int b;
            while((b=bis.read())!=-1){
                bos.write(b);
            }

            //创建字符输出流,网络上的流
            BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (accept!=null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

           if(bos!=null){
               try {
                   bos.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

        }

    }
}
