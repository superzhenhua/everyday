package day11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建Filereader对象,读取文档中的内容
        FileReader fr =new FileReader("D:\\workspace\\zhenhua_code\\JavaEE\\Day11\\bb.txt");
        StringBuilder sb =new StringBuilder();
        //定义一个字符数组
        char []chars =new char[1024];
        int len =-1;
        while((len= fr.read(chars))!=-1){
            for (int i = 0; i < len; i++) {
                //处理有效字符
                sb.append(chars[i]);
            }
        }
        //释放资源
        fr.close();
        //获取内容
        String name = sb.toString();
        //拼接要输出的内容
        String content ="东哥爱\r\n"+name;
        //创建Filerwriter对象
        FileWriter fw =new FileWriter("D:\\workspace\\zhenhua_code\\JavaEE\\Day11\\cc.txt");
        fw.write(content);
        //释放资源
        fw.close();
    }
}
