package day11;

import javax.naming.NamingEnumeration;
import java.io.*;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        //准备aa,txt文件
        //创建BufferedReader,读取aa.txt中的第一行内容
        //创建创建字符输入流给BufferedReader
        InputStream in =new FileInputStream("D:\\workspace\\zhenhua_code\\JavaEE\\Day11\\aa.txt");
        String code ="UTF-8";
        InputStreamReader reader =new InputStreamReader(in, code);
        BufferedReader bis = new BufferedReader(reader);
        //读取内容一行内容
        String line = bis.readLine();
        //释放资源
        bis.close();
        //切割,得到数组
        String[] split = line.split(",");
        //对数组进行排序
        Arrays.sort(split);
        //将排序好的数组进行拼接
        //创建sb
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i!=split.length-1){
                //如果不是最后一个索引,按照元素+","拼接
                sb.append(split[i]+",");
            }else{
                //否则,直接拼接元素
                sb.append(split[i]);
            }
            //获取要输出的这个字符串内容
            String s = sb.toString();

            //创建一个字节输出流
            OutputStream ops =new FileOutputStream("D:\\workspace\\zhenhua_code\\JavaEE\\Day11\\bb.txt");
            //创建字符输出流
            OutputStreamWriter writer =new OutputStreamWriter(ops,code);
            //创建缓存字符输出流
            BufferedWriter writer1 = new BufferedWriter(writer);
            //书写内容
            writer1.write(s);
            //释放资源
            writer1.close();
        }

    }
}
