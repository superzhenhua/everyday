package com.Text;

public class CarText {
    public static void main(String[] args) {
        //创建对象
        Car c1 =new Car();
        c1.setBrand("奔驰");
        c1.setPrice(1000000);

        Car c2 =new Car();
        c2.setBrand("奔驰");
        c2.setPrice(800000);

        Car c3 =new Car();
        c3.setBrand("奔驰");
        c3.setPrice(400000);
        //静态初始化数组
        Car [] arr={c1,c2,c3};
        //定义变量求和
        int sum =0;
        //遍历
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        //打印
        System.out.println("sum:"+sum);
    }
}
