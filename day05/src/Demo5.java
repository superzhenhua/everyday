//带返回值的方法调用

import javax.swing.plaf.BorderUIResource;

public class Demo5 {
    public static void main(String[] args) {
        //输出调用

        System.out.println(isEvenNumber(11));

    }
    //定义一个方法,该方法接收一个参数,判断该数据是否为偶数,并返回真假值
    public static boolean isEvenNumber(int a){
        if(a%2==0){
            return true;


        }else{
            return false;
        }
    }
}
