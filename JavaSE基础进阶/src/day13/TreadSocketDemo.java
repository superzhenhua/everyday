package day13;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class TreadSocketDemo implements Runnable{
        private Socket accept;
    public TreadSocketDemo(Socket accept) {
        this.accept=accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos=null;
            try {
                //创建网络接收流,从客户端读取数据
                BufferedInputStream bis =new BufferedInputStream(accept.getInputStream());
                //创建本地的流,把数据存到本地文件中
                bos =new BufferedOutputStream(new FileOutputStream("D:\\workspace\\zhenhua_code\\JavaSE基础进阶\\123\\"+ UUID.randomUUID().toString()+".jpg"));
                //将数据写入本地文件永久保存
                int b;
                while((b=bis.read())!=-1){
                    bos.write(b);
                }
                //创建字符输出流
                BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                bw.write("上传成功");
                bw.newLine();
                bw.flush();

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
               if(bos!=null){
                   try {
                       bos.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
                    if(accept!=null){
                        try {
                            accept.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    //socket.close();
            }
        }
    }

