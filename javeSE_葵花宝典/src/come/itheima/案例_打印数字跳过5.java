package come.itheima;

/*
分析并完成以下需求:
    1.打印[1-1000]之间的整数，数字中包含5，或者是5的倍数的数字要跳过
    2.要求控制台每行打印6个满足条件的数，之间用空格分隔
 */
public class 案例_打印数字跳过5 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;
        //遍历1-1000的整数
        for (int i = 1; i <= 1000; i++) {
            //数值拆分
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            int qian = i / 1000;
            //if语句按要求判断
            if (ge == 5 || shi == 5 || bai == 5 || i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
            count++;

            //6个一分行
            if (count % 6 == 0) {
                System.out.println();
            }


        }

    }
}



