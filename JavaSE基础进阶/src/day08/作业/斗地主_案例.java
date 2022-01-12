package day08.作业;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/*
需求：
        请使用HashMap模拟斗地主（3人斗地主）：
        1.准备牌；
        循环嵌套，外层循环：黑红梅方  内层循环：1-K
        往容器存储 ♦4..   小王 大王
        2.发牌；
        有四个容器，分别随机存储各自的牌
        3.看牌；
        运行结果（每次运行的结果都是随机的）：
 */
public class 斗地主_案例 {
    public static void main(String[] args) {
        //第一步:准备牌
        //创建Arrarylist集合
        ArrayList<String> list = new ArrayList<>();
        //创建花色和数字数组
        String[] color = {"♦", "♣", "♠", "♥"};
        String[] numb = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //遍历两个数组将数组的元素添加到集合中
        for (String colors : color) {
            for (String numbs : numb) {
                list.add(colors + numbs);
            }
        }
        list.add("大王");
        list.add("小王");
        //洗牌
        Collections.shuffle(list);
        //第二部发牌
        //创建四个集合,三个玩家和一个底牌集合
        ArrayList<String> lqxList = new ArrayList<>();
        ArrayList<String> liuyanList = new ArrayList<>();
        ArrayList<String> fengqyList = new ArrayList<>();
        ArrayList<String> dpList = new ArrayList<>();
        //遍历集合,将牌发给各个玩家
        for (int i = 0; i < list.size(); i++) {
            //获取集合里的每张牌
            String poker = list.get(i);
            if (i >= list.size() - 3) {
                dpList.add(poker);
            } else if (i % 3 == 0) {
                lqxList.add(poker);
            } else if (i % 3 == 1) {
                liuyanList.add(poker);
            } else if (i % 3 == 2) {
                fengqyList.add(poker);
            }
        }
        //调用方法看牌
        lookpoker("林青霞", lqxList);
        lookpoker("柳岩", liuyanList);
        lookpoker("风清扬", fengqyList);
        lookpoker("底牌", dpList);
    }

    //定义看牌方法
    public static void lookpoker(String name, ArrayList<String> list) {
        System.out.println(name + "的牌是:");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
