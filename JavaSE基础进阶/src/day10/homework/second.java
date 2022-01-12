package day10.homework;

import java.io.File;

public class second {
    public static void main(String[] args) {
        File file = new File("D:\\aa");
        int count = 0;
        String name1 = file.getName();

        for (int i = 0; i < count; i++) {
            System.out.print("  ");
        }
        System.out.println( name1);
        count++;
        printDir(file,-1);
//count默认为零
    }
    public static void printDir(File file,int count){
            count++;
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                for (int i = 0; i < count; i++) {
                    System.out.print("  ");
                }
                System.out.println(file1.getName());

            }else {
                for (int i = 0; i < count; i++) {
                    System.out.print("  ");
                }
                System.out.println(file1.getName());

                printDir(file1,count);
            }
        }
    }
    /*
    定义一个方法，将给定文件, 文件夹以及子文件夹的名称以指定格式打印到控制台，第一级前没有tab键的效果，
    第二级前有一个tab键的效果，第三级有两个tab键的效果。格式如下：
    day01资料
	-- 视频
		-- 01.IO流概述.avi
		-- 02.IO流分类.avi
	-- 代码
		-- file_demo
			-- src
				-- com
					-- ithema
	-- 笔记
		File类及IO流.md
     */
}
