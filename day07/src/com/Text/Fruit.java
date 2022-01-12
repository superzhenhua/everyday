package com.Text;
/*
1.定义一个水果类：Fruit
		成员变量：名称name  单价price  计价单位unit
		提供构造方法、get和set方法
		成员方法：show()   用于显示成员变量的信息
	2.定义一个测试类：Test02
	3.在测试类中创建4个Fruit对象。并调用show()方法显示数据
		输出效果：
			水果名称：苹果，价格为：3元，计价单位为：斤
			水果名称：橘子，价格为：5元，计价单位为：斤
			水果名称：香蕉，价格为：2元，计价单位为：斤
			水果名称：榴莲，价格为：200元，计价单位为：个

 */
public class Fruit {
    //成员变量
    private String name;
    private double price;
    private  double unit;
    //构造方法
    public Fruit() {
    }
    public Fruit(String name, double price, double unit) {
        this.name = name;
        this.price = price;
        this.unit = unit;
    }
    //构造get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }
    //构造成员方法
    public void show(){
        System.out.println(name+","+price+","+unit);
    }

}
