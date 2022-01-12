package day12.homework;

import javax.print.DocFlavor;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        System.out.println(getRandomName(10));

    }


    private static String getRandomName(int length){
        //定义一个字符串
        String name ="刘备,张飞,关羽,曹擦,吕布,典韦,赵云,黄忠,孙尚香,太史慈";
        //将字符串切割
        String[] split = name.split(",");
        //创键随机对象
        Random random =new Random();
        //创键sb对象
        StringBuilder sb =new StringBuilder();
        //遍历数组并将切割后的字符拼接进入容器中
        for (int i = 0; i <split.length ; i++) {
            int numb = random.nextInt(split.length);
            //拼接
            sb.append(split);
        }
        return sb.toString();

    }
}
