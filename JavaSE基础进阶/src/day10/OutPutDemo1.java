package day10;

import java.io.FileOutputStream;
import java.io.IOException;
//1.6以前版本
public class OutPutDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =null;
        try {
            fos = new FileOutputStream("D:\\ab.txt");
            fos.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //finally内的代码一定会被执行
            if(fos!=null){
                try {
                    fos.close();//有可能会报空指针异常需做非空判断
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("aaaaaaa");

    }
}
