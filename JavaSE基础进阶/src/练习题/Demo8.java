/*
package 练习题;

import java.util.Random;
import java.util.concurrent.*;

*/
/*
某公司组织年会，会议入场时有两个入口，在入场时每位员工都能获取一张双色球彩票，假设公司有100个员工， 利用多线程模拟年会入场过程，并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。

        线程运行后打印 格式如下：

        ```java
        编号为: 2 的员工 从后门 入场! 拿到的双色球彩票号码是:[17, 24, 29, 30, 31, 32, 12]
        编号为: 1 的员工 从后门 入场! 拿到的双色球彩票号码是:[16, 11, 14, 22, 29, 32, 15]
//.....
        从后门入场的员工总共: 13 位员工
        从前门入场的员工总共: 87 位员工
        ```

        **注意：**双色球可以随机生成一个数组，里面的7个元素随机生成即可，不考虑内容
*//*

public class Demo8 {
    public static void main(String[] args) {
        //定义一个容器
        StringBuilder sb = new StringBuilder();
        //创建随机对对象
        Random random = new Random();
        sb.append("[");
        for (int i = 1; i <= 7; i++) {
            int numb = random.nextInt(100);
            if (numb != sb.length() - 1) {
                sb.append(numb + ",");
            } else {
                sb.append(numb);
            }
        }
        sb.append("]");
        //遍历
        System.out.println(sb.toString());
        //创建Door对象
        DoorDemo door =new DoorDemo(100);
        //创建线程对象
        TreadQian t1 =new TreadQian(door);
        TreadHou t2 =new TreadHou(door);


    }

}
*/
