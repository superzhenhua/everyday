package come.itheima;

import java.util.ArrayList;
import java.util.Random;

/*
测试类：
		品牌价格自拟，已行驶距离使用随机数生成，范围是[1-1800]
		将创建好的三个对象存入ArrayList<ECar>集合中
		查找集合中是否存在，行驶公里在1000公里以下的车
			如果有将其信息打印在控制台(使用get方法获取数据并拼接)
			如果没有则打印[抱歉!没有满足条件的汽车]
 */
public class EcarText {
    public static void main(String[] args) {
        //生成随机数
        int km = new Random().nextInt(1801) + 1;
        //创建三个对象
        Ecar e1 = new Ecar("宝马", 1000000, km);
        Ecar e2 = new Ecar("奔驰", 8000000, km);
        Ecar e3 = new Ecar("宝骏", 800000, km);
        //放入集合中
        ArrayList<Ecar> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        //接收返回
        int index = getIdex(list);
        //判断index
        if (index==-1){
            System.out.println("抱歉!没有满足条件的汽车");
        }else{
            System.out.println(list.get(index).getBrand()+list.get(index).getPrice()+list.get(index).getKm());
        }
    }

    //定义一个方法
    public static int getIdex(ArrayList<Ecar> list) {
        int index = -1;
        //判断在集合中是否存在
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKm() < 1000) {
                //找到了记录索引
                index = i;
            }
        }
        return index;
    }


}
