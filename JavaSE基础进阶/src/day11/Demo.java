package day11;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        InputStream in = new FileInputStream("D:\\workspace\\zhenhua_code\\JavaEE\\Day11\\aaa.txt");
        //获取方式
        String code = "utf-8";
        //创建字符输入流
        InputStreamReader reader = new InputStreamReader(in, code);
        //声明一个Stringbuilder,记录文件中读取到的字符
        StringBuilder sb = new StringBuilder();
        //定义一个数组
        char[] chars = new char[1024];
        int len = -1;
        while ((len = reader.read(chars)) != -1) {
            //处理有效字符,将字符放入sb对象中
            for (int i = 0; i < len; i++) {
                sb.append(chars[i]);
            }
        }
        //释放资源
        reader.close();
        //得到文件名字
        String name = sb.toString();
        //拼写要输出的内容
        String count = "东哥爱\r\n"+name;
        //创建字符输出流
        OutputStream ops = new FileOutputStream("D:\\workspace\\zhenhua_code\\JavaEE\\Day11\\aaa.txt");
        OutputStreamWriter writer = new OutputStreamWriter(ops, code);

        //输出
        writer.write(count);
        //释放资源
        writer.close();
    }
}
