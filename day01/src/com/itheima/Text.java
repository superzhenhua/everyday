package com.itheima;
 /*
 1.商场根据消费金额不同，折扣也不同，折扣的规则如下（P代表消费的总金额）
   P >= 2000 7折
         1000 <= P < 2000 8折
        500 <= P < 1000 9.5折
        P < 500 不打折
        2.要求根据输入的消费金额，输出对应的折扣和折扣前后的金额
  */

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        //提示输入
        System.out.println("请输入消费金额");
        //创建键盘对象,接收数据
        int cost = new Scanner(System.in).nextInt();
        //if语句按要求判断,并做健壮性判断
        if(cost<=0){
            System.out.println("您输入的金额有误,请重新输入");

        }else if(cost>=2000){
            System.out.println("您的消费为:"+cost+"按七折优惠,折后价格为"+(cost*0.7));

        }else if(cost>=1000&&cost<2000){
            System.out.println("您的消费为:"+cost+"按八折优惠,折后价格为"+(cost*0.8));
        }
            else if(cost>=500&&cost<1000){
        System.out.println("您的消费为:"+cost+"按九五折优惠,折后价格为"+(cost*0.95));

    }else{
            System.out.println("您的消费为:"+cost+"不打折");
        }

    }


}
