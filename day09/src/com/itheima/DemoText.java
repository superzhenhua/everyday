package com.itheima;
/*
定义测试类，在main方法中完成以下要求：
         实例化三个Movie对象，属性：战狼,吴京,动作、阿凡达,詹姆斯卡梅隆,科幻、流浪地球,吴京,科幻
         将对象分别添加到合适的集合中
         遍历集合，将导演为吴京的电影，按照如下格式打印到控制台
         战狼-吴京-动作
         流浪地球-吴京-科幻
 */

import java.util.ArrayList;

public class DemoText {
    public static void main(String[] args) {
        //创建movie对象
        Movie m1 = new Movie("战狼","吴京","动作");
        Movie m2 = new Movie("阿凡达","詹姆斯卡梅隆","科幻");
        Movie m3 = new Movie("流浪地球","吴京","科幻");
        //将对象分别添加到合适的集合中
        //创建集合
        ArrayList<Movie>list=new ArrayList<>();
        //添加元素
        list.add(m1);
        list.add(m2);
        list.add(m3);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //获取当前电影对象
            Movie m = list.get(i);
            //将导演为吴京的电影
            if(m.getDirector().equals("吴京")){
                System.out.println(m.getTitle()+"-"+m.getDirector()+"-"+m.getType());
            }
        }


    }
}
