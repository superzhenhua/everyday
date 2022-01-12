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
public class FruitText {
    public static void main(String[] args) {
        //创建四个对象
        Fruit f1 =new Fruit("苹果",3.0,1.0);
        Fruit f2 =new Fruit("橘子",5.0,1.0);
        Fruit f3 =new Fruit("香蕉",2.0,1.0);
        Fruit f4 =new Fruit("榴莲",200.0,1.0);
        //调用show方法输出
            f1.show();
    }
}
