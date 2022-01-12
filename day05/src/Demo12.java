import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/*
    需求: 模拟计算器
        提示用用户输入选择[1加法 2减法 3乘法 4除法 5取余 0退出 6查看历史记录]拓展
        打印用户选择的计算方式
        提示用户录入两个参与运算的数据
        通过计算打印对应的结果(拼接成一个算式)

 */
public class Demo12 {
    public static void main(String[] args) {
        System.out.println("欢迎来到黑马计算器");
        //定义数组(动态数组初始化)
        String[] arr = new String[100];
        //定义计算次数计数器
        int count =-1;

        //键盘录入,并接收数据
        Scanner sc = new Scanner(System.in);
        //使用while死循环
        while (true) {
            System.out.println("请选择计算方式");
            //提示用户输入选择并接收
            System.out.println("[1加法 2减法 3乘法 4除法 5取余 0退出 6查看历史记录]");

            int numb = sc.nextInt();
            //打印用户选择的计算方式
            System.out.println(numb);
            //拿到用户选择做健壮性判断
            if (numb == 0) {
                System.out.println("正在退出,谢谢您的使用");
                break;
            }

            if (numb < 1 || numb > 6) {
                System.out.println("您的选择的数字:" + numb + "有误,请重新输入");
                continue;
            }
            //提示用户输入两个数据,并接收
            System.out.println("请输入第一个数字");
            int a = sc.nextInt();
            System.out.println("请输入第二个数字");
            int b = sc.nextInt();

            //使用switch语句对输入内容进行判断
            switch (numb) {
                case 1:
                    System.out.println("用户选择加法");
                    System.out.println(a + "+" + b + "=" + (a + b));
                    count++;
                    arr[count]=a + "+" + b + "=" + (a + b);

                    break;
                case 2:
                    System.out.println("用户选择减法");
                    System.out.println(a + "-" + b + "=" + (a - b));
                    count++;
                    arr[count]=a + "-" + b + "=" + (a - b);

                    break;
                case 3:
                    System.out.println("用户选择乘法");
                    System.out.println(a + "*" + b + "=" + (a * b));
                    count++;
                    arr[count]=a + "*" + b + "=" + (a * b);
                    break;
                case 4:
                    System.out.println("用户选择除法");
                    System.out.println(a + "/" + b + "=" + (a / b));
                    count++;
                    arr[count]=a + "/" + b + "=" + (a / b);
                    break;
                case 5:
                    System.out.println("用户选择取余");
                    System.out.println(a + "%" + b + "=" + (a % b));
                    count++;
                    arr[count]=a + "%" + b + "=" + (a % b);
                    break;
                case 6:
                    System.out.println("用户选择查看历史数据");
                    for (String s : arr) {
                        if(s!=null){
                            System.out.print(s+" ");
                        }
                    }
                    System.out.println();
                    break;
            }
            System.out.println("------------");
        }
    }
}



