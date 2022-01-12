package day10.homework;

import java.io.File;

public class third {
    public static void main(String[] args) {
        File file = new File("D:\\aa");
        deleteFile(file);
        deleteDir(file);


    }

    private static void deleteFile(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()&&file1.length()>1024*2){
                file1.delete();
            }else if(file1.isDirectory()){
                deleteFile(file1);
            }
        }
        deleteDir(file);
    }

    private static void deleteDir(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                if(file1.listFiles().length==0){
                    file1.delete();
                }else {
                    deleteDir(file1);
                }
            }
        }
    }
    //删除给定文件夹下所有大于2M的文件，如果文件夹下的子文件或者子文件夹被删除完毕了，也将该文件夹删除。

}
