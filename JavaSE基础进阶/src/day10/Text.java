package day10;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class Text {
    public static void main(String[] args) throws IOException {
        //创建对象
        File file =new File("JavaEE\\Day11");
        //判断文件夹是否存在
        if(!file.exists()){
            //如果不存在就创建一个
            file.mkdirs();
        }
        //创建一个新的file对象,可以采用文件夹和文件拼接的方式
        File file1 =new File(file,"aa.txt");
        file1.createNewFile();

      /*  //创建file对象
        File file =new File("JavaEE\\Day11");
        //判断文件夹是否存在
        if(!file.exists()){
            //如果当前文件夹不存在就创建一个
                file.mkdirs();
        }
        //创建新的file对象
        File file1 =new File(file,"aaa.txt");
        //创建文件名,可以采用文件夹和文件进行拼接的方法
        file1.createNewFile();*/
    }
}
