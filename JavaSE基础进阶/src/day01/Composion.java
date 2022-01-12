package day01;

import java.util.zip.GZIPOutputStream;
public abstract class Composion {
    //写作方法
    public final void write(){
        //文章标题 固定
        System.out.println("参加公益活动的一天");
        //文章内容,不固定,定义为抽象
        body();
        //结尾
        System.out.println("啊,我感觉真好");
    }
//定义抽象类:内容
    public abstract void body();


}
