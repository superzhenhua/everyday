package arr;

import java.util.Scanner;
  /*      需求:
        6个评委给1名选手打分,分数是[1-100]之间的整数(扩展)
        将分数装入一个合适的容器中
        要求去掉最高分,去掉最低分,计算选手平均值
        */
public class Demo2 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;
        //定义数组
        int[] arr = new int[6];
        //创建键盘对象
        Scanner sc = new Scanner(System.in);

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //提示评委打分,接收数据
            System.out.println("请第" + (i + 1) + "位评委打分");
            int numb = sc.nextInt();
            if (numb > 100 || numb < 1) {
                System.out.println("数据有误");
                i--;

            } else {
                arr[i] = numb;
                //求元素的和
                sum += arr[i];
            }
        }
        //求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //求最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //求平均数
        int avg = (sum - max - min) / (arr.length - 2);
        //打印
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }
}
