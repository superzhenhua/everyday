package com.itheima;
/*
分析并完成以下需求:

        设计一个Movie类，私有成员变量：
        title片名、director导演、type类型
        提供空参、带参构造
        提供getXxx()、setXxx()方法

        定义测试类，在main方法中完成以下要求：
        实例化三个Movie对象，属性：战狼,吴京,动作、阿凡达,詹姆斯卡梅隆,科幻、流浪地球,吴京,科幻
        将对象分别添加到合适的集合中
        遍历集合，将导演为吴京的电影，按照如下格式打印到控制台
        战狼-吴京-动作
        流浪地球-吴京-科幻
 */
public class Movie {
    //成员变量
    private String  title;
    private String  director;
    private String  type;
    //构造方法


    public Movie() {
    }

    public Movie(String title, String director, String type) {
        this.title = title;
        this.director = director;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
