package com.HomeWork2;

public class Car {
    //定义成员变量
    private String brand;
    private double price;

    //构造空参方法
    public Car() {
    }

    //构造带参方法
    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // 成员方法 -> 必须提供对应的gerXxx和setXxx方法 -> 没有要求就不写其他成员方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
