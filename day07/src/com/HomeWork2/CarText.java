package com.HomeWork2;
/*
    需求:
        实例化(创建)三个汽车对象,属性值自拟
        将三个汽车对象存入一个合适的容器中
        遍历容器,计算三个汽车的价格之和
 */
import com.HomeWork.Car;

public class CarText {
    public static void main(String[] args) {
        //创建三个对象
        Car c1 = new Car("宝马",8000000);
        Car c2 = new Car("宝骏",80000);
        Car c3 = new Car("五菱宏光",50000);
        //定义数组并对其静态初始化
        Car[]arr={c1,c2,c3};
        //定义求和
        int sum =0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //求和,调用get方法,arr[i]代表汽车品牌的元素
            sum += arr[i].getPrice();
        }
        //打印
        System.out.println("sum:"+sum);
    }
}
