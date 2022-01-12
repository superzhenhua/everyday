package come.itheima;
/*
	定义ECar类属性有：
		brand品牌String、price价格double、km已行驶距离int
		提供空参、带参构造
		提供getXxx()、setXxx()方法

	测试类：
		品牌价格自拟，已行驶距离使用随机数生成，范围是[1-1800]
		将创建好的三个对象存入ArrayList<ECar>集合中
		查找集合中是否存在，行驶公里在1000公里以下的车
			如果有将其信息打印在控制台(使用get方法获取数据并拼接)
			如果没有则打印[抱歉!没有满足条件的汽车]
 */
public class Ecar {
    private String brand;
    private double price;
    private int  km;

    public Ecar() {
    }

    public Ecar(String brand, double price, int km) {
        this.brand = brand;
        this.price = price;
        this.km = km;

    }

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

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}

