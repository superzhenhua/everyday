import java.util.Scanner;

//模拟计算器,提示用户选择[1加法2减法3乘法4除法5取余6 查看历史记录] 打印选择的计算方式 提示用户录入两个数据 通过计算打印对应结果 拼接成算式
public class test {
    public static void main(String[] args) {

        System.out.println("##欢迎使用黑马计算器##");
        //定义String类型history数组
        String[] history = new String[100];
        //定义计算次数的计数器
        int count = -1;
        outside:
        for (; ; ) {

            System.out.println("1 加法 2 减法 3 乘法 4 除法 5 取模 6 查看历史记录 0 退出");
            System.out.println("请输入你的选择:");
            int choose = new Scanner(System.in).nextInt();
            //判断选择的输入数据的合法性
            while (choose > 6 || choose < 0) {
                System.out.println("您输入有误,请重新输入选择(取值范围[0,5]的整数):");
                choose = new Scanner(System.in).nextInt();
            }
            //利用switch选择运算方式并输出结果
            switch (choose) {
                case 1:
                    System.out.println("您选择的是加法!");
                    count++;
                    history[count] = sum();

                    break;
                case 2:
                    System.out.println("您选择的是减法!");
                    count++;
                    history[count] = jianfa();
                    break;
                case 3:
                    System.out.println("您选择的乘法!");
                    count++;
                    history[count] = chengfa();
                    break;
                case 4:
                    System.out.println("您选择的是除法!");
                    count++;
                    history[count] = chufa();
                    break;
                case 5:
                    System.out.println("您选择的是取模!");
                    count++;
                    history[count] = qumo();
                    break;
                case 6:
                    System.out.println("您选择的是查看历史记录!");
                    for (String s : history) {
                        if(s!=null) {
                            System.out.print(s + "  ");
                        }
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("正在退出,请稍等,感谢使用!");
                    break outside;
                default:
                    break;
            }
            System.out.println("------华丽的分割线------");
        }
    }

    public static String sum() {
        System.out.println("请输入加法运算的第一个数字:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入加法运算的第二个数字:");
        int num2 = new Scanner(System.in).nextInt();
        String res = num1 + "+" + num2 + "=" + (num1 + num2);
        System.out.println("您计算的结果:" + res);
        return res;


    }

    public static String jianfa() {
        System.out.println("请输入减法运算的第一个数字:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入减法运算的第二个数字:");
        int num2 = new Scanner(System.in).nextInt();
        String res = num1 + "-" + num2 + "=" + (num1 - num2);
        System.out.println("您计算的结果:" + res);
        return res;
    }

    public static String chengfa() {
        System.out.println("请输入乘法运算的第一个数字:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入乘法运算的第二个数字:");
        int num2 = new Scanner(System.in).nextInt();
        String res = num1 + "*" + num2 + "=" + (num1 * num2);
        System.out.println("您计算的结果:" + res);
        return res;
    }

    public static String chufa() {
        System.out.println("请输入除法运算的第一个数字:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入除法运算的第二个数字:");
        int num2 = new Scanner(System.in).nextInt();
        String res = num1 + "/" + num2 + "=" + (num1 / num2);
        System.out.println("您计算的结果:" + res);
        return res;
    }

    public static String qumo() {
        System.out.println("请输入取模运算的第一个数字:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("请输入取模运算的第二个数字:");
        int num2 = new Scanner(System.in).nextInt();
        String res =  num1 + "%" + num2 + "=" + (num1 % num2);
        System.out.println("您计算的结果:" + res);
        return res;
    }
}
