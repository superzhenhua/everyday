package come.itheima;

import java.util.Scanner;

/*
分析并完成以下需求:
    1.控制台提示并键盘录入，总共6个评委给1名选手打分，分数为[1-100]之间的int类型整数
    2.对录入分数进行判断，超出范围给出提示，重新录入
    4.将分数存储到合适的数组中
    3.去除一个最高分、一个最低分，统计该选手的平均成绩，并在控制台打印
 */
public class 案例_评委打分 {
    public static void main(String[] args) {
        //定义求和
        int sum = 0;

        //动态数组初始化
        int[]arr = new int[6];
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //提示
            System.out.println("请第"+(i+1)+"位评委打分");
            //创建键盘对象并接收数据
            int score=new Scanner(System.in).nextInt();
            //健壮性判断
            if(score>100||score<0){
                System.out.println("输入成绩有误,请重新录入");
                i--;

            }else{
                arr[i]=score;
            }

        }
            int sum1 = ArraryTools.getSum(arr);
            int max = ArraryTools.getMax(arr);
            int min = ArraryTools.getMin(arr);
            int avg= (sum1-max-min)/arr.length-2;

            //打印
            System.out.println(avg);



    }
}



