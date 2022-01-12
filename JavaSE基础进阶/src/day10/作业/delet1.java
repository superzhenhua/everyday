package day10.作业;

import java.io.File;

//删除文件夹
public class delet1 {
    public static void main(String[] args) {
        //创建文件夹对象,找到路径
        File scr =new File("D:\\scr");
        //调用删除方法
        deletDir(scr);
    }
    private static void deletDir(File scr) {
        //做健壮判断,如果是文件直接返回
        if(scr.isFile()){
             return;
        }
        //进入文件夹,获取每个对象
        File[] files = scr.listFiles();
        //遍历数组获取每个对象
        for (File file : files) {
            //判断是否为文件
            if(file.isFile()){
                scr.delete();
            }else{
                deletDir(file);
            }
        }
        //文件夹内内容删除完后删除空文件夹
        scr.delete();
    }
}
