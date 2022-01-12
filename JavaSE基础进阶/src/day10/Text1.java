package day10;

import java.io.File;

/*
练习二:删除一个多级文件夹

*/
public class Text1 {
    public static void main(String[] args) {
        File src =new File("D:\\src");
        //创建删除方法
        deleteDir(src);
    }

    private static void deleteDir(File src) {
        //做健壮性判断,如果是文件直接退出
        if(src.isFile()){
            return;
        }
        //删除src文件夹的所有内容
        File[] files = src.listFiles();//首先得到文件夹所有内容
        //遍历数组得到每一个内容
        for (File file : files) {
            //如果是文件直接删除
            if(file.isFile()){
                file.delete();
            }else{
                //递归:要删除file这个文件夹以及文件夹中的所有内容
                deleteDir(file);
            }
        }
        //走到这说明src中的所有内容已经删除,此时可以删除空文件夹
        src.delete();

    }
}
