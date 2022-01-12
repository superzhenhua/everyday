package day03.私有成员内部类和静态成员内部类;

//私有
public class innerText {
    public static void main(String[] args) {
        //创建外部类对象
        Outer o = new Outer();
        o.useInner();
    }
}

//外部类
class Outer {
    //在内部类外面对外提供一个公共访问对象
    public void useInner() {
        Inner i = new Inner();
        i.show();
    }

    //私有成员内部类,提供show方法
    private class Inner {
        public void show() {
            System.out.println("这是Inner 的show方法");
        }
    }
}