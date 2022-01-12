package day12;

import jdk.swing.interop.SwingInterOpUtils;

public class GirlDemo extends Thread{
    @Override
    public void run() {
        while(MoneyDemo.money==100000){
        }
        System.out.println("不是十万元了");
    }
}
