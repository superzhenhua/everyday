package day03.静态成员内部类;

import org.w3c.dom.ls.LSOutput;

public class innerText {
    public static void main(String[] args) {

        //静态成员的颞部类创建正确格式
        Outer.Inner oi = new Outer.Inner();
        oi.show();
        //调用静态成员内部类
        Outer.Inner.method();
    }
}

//外部类
class Outer {
    //静态成员内部类,提供show方法
    static class Inner {
        public void show() {
            System.out.println("这是innenr的show方法");
        }

        //提供静态方法
        public static void method() {
            System.out.println("这是静态的show方法");
        }
    }
}