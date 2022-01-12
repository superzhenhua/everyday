package 练习题;

import ch.qos.logback.core.joran.action.NewRuleAction;

import java.io.File;
import java.util.ArrayList;

/*1.打印指定目录下所有的txt文件的名称(不打印文件夹路径)
        2.获取指定目录(包含子目录)下所有的txt文件的个数,并打印文件名称
        3.定义工具类，编写方法：
public static ArrayList<String> getAllFileNames2List(File srcDir,String fileType)
        参数File srcDir:源文本文件
        参数String fileType:文件类型(比如：.doc,.txt,.java)
        方法要求：将srcDir文件夹(包含子文件)所有扩展名为fileType的文件名称存入ArrayList<String>集合并返回
        4.测试方法*/
public class Demo5 {
    public static void main(String[] args) {
        //准备一个文件夹
        File file = new File("D:\\srcDir");
        //调用方法
        ArrayList<String> list = getAllFileNames2List(file, "txt");
        //遍历输出
        System.out.println(list);
        System.out.println(list.size());
    }

    /**
     * @param srcDir   文件夹的路径
     * @param fileType 获取的文件的类型(文件的后缀名) txt
     * @return 返回的是指定类型的文件的所有的集合
     */
    public static ArrayList<String> getAllFileNames2List(File srcDir, String fileType) {
        //定义一个集合用来存储文件名字
        ArrayList<String> names = new ArrayList<>();
        //获取当前文件夹所有的内容
        File[] files = srcDir.listFiles();
        //遍历文件
        for (File file : files) {
            //判断当前文件是文件还是文件夹
            if (file.isFile()) {
                //是文件,判断是不是指定的后缀名文件
                if (file.getName().endsWith(fileType)) {
                    //如果是将文件名放入集合
                    names.add(file.getName());
                }
            } else {
                //是文件夹,利用递归 ,将后缀名名称返回集合
                ArrayList<String> list = getAllFileNames2List(file, fileType);
                //将子文件夹内的文件名也加入集合中
                names.addAll(list);
            }
        }
        //将集合返回
        return names;
    }

}
