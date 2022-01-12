package com.Text;

public class Car {
    //成员变量
    private String brand;
    private double price;
    //set和get方法
    public void setBrand(String  brand){
       this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    //成员方法
    public void LaRen(){
        System.out.println("拉人");
    }
    public void LaHuo(){
        System.out.println("拉货");
    }
}
