package day11.作业.homework;

import com.sun.source.tree.NewArrayTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

/*需求：（点名器）
        1.已经在某个磁盘存在一个文件，并且该文件中存储了很多人的名字，每个名字独占一行，例如：
        F:\names.txt中内容如下：
        柳岩
        西施
        王昭君
        貂蝉
        杨玉环
        2.请编写一个程序，每次运行，都可以在控制台随机的输出一个文件中的名字*/
public class 点名器 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        InputStream in = new FileInputStream("D:\\name.txt");
        //编码方式
        String code = "UTF-8";
        //创建字符输入流
        InputStreamReader isr = new InputStreamReader(in, code);
        //创建缓冲字符输入流
        BufferedReader reader = new BufferedReader(isr);
        //创建一个list集合用来储存名字
        ArrayList<String>listName=new ArrayList<>();
        //读写
        String s ;
        while((s=reader.readLine())!=null){
            listName.add(s);
        }
        //释放资源
        reader.close();
        System.out.println(listName);
        //使用rondom产生随机数
        Random r =new Random();
        //该方法是生成一个随机的int值,该值介于[0,n)之间
        int index = r.nextInt(listName.size());
        //获取值
        String name = listName.get(index);
        System.out.println("点到的名字是"+name);
    }

}
