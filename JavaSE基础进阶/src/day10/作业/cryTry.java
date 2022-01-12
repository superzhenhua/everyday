package day10.作业;

import java.io.FileOutputStream;
import java.io.IOException;

public class cryTry {
    public static void main(String[] args) throws IOException {
        //创建输出文件输出流
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\ab.txt");
            fos.write(100);
        } catch (IOException e){
          e.printStackTrace();

        }finally{
            if(fos!=null){
                try {
                    fos.close();//
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
