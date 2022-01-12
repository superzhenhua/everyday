package day10.作业;

import java.io.File;

//删除文件夹src
public class delet {
    public static void main(String[] args) {
        //创建对象找到文件夹位置
        File scr =new File("D:\\scr");
        //调用删除方法
        deletDir(scr);
    }
    private static void deletDir(File scr) {
        //做健壮性判断,如果是文件直接退出
        if(scr.isFile()){
        return;
        }
        //进入文件夹得到文件夹内所有内容
        File[] files = scr.listFiles();
        //遍历文件夹获取每一个文件
        for (File file : files) {
            //判断是否为文件
            if(file.isFile()){
                file.delete();
            }else{
                //递归
                deletDir(file);
            }
        }
        //删除空文件夹
        scr.delete();
    }
}
