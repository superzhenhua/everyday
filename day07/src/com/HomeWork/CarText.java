package com.HomeWork;
/*
    需求:
        实例化(创建)三个汽车对象,属性值自拟
        将三个汽车对象存入一个合适的容器中
        遍历容器,计算三个汽车的价格之和
 */
public class CarText {
    public static void main(String[] args) {
        //创建三个对象
        Car c1 =new Car("奔驰",1000000);
        Car c2 =new Car("宝马",800000);
        Car c3 =new Car("奥迪",1000000);

        //静态初始化数组
        Car[]arr={c1,c2,c3};
        //定义求和
        int sum=0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        System.out.println("sum:"+sum);
    }
}
