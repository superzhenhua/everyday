package day01;

public class Zii extends Fuu{
    public void show(){
        System.out.println("子类的show方法");
    }
    public void methor(){
        //调用本类成员方法
        this.show();
        //调用父类成员方法
        super.show();
    }
}
