package come.itheima;
/*
1.程序运行后通过键盘录入一个字符串。要求字符串中必须包含：大写字母
        2.如果录入的字符串中没有大写字母、要进行给出提示。然后程序可以继续录入字符串
        3.如果录入的字符串中有大写字母。那么统计这个字符串中小写字母、大写字母、数字、其他字符出现的个数。程序结束
        例如：
        请输入一个字符串：
        123456abc
        您输入的字符串中没有大写字母。请重新输入：
        ABC456ghi$%^&D
        大写字母有：4个
        小写字母有：3个
        数字有：3个
        其他字符有：4个
 */
import java.util.Scanner;

public class 字符串定义方法 {
    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("请输入:");
            String s = new Scanner(System.in).nextLine();

            int countNum = 0, countBigLetter = 0, countSmallLetter = 0, countOther = 0;
            if (findBigChar(s)) {

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                        countBigLetter++;
                    } else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                        countNum++;
                    } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                        countSmallLetter++;
                    } else {
                        countOther++;
                    }
                }
                System.out.println("大写字母有：" + countBigLetter);
                System.out.println("小写字母有：" + countSmallLetter);
                System.out.println("数字有：" + countNum);
                System.out.println("其他字符有：" + countOther);
                break;
            } else {
                System.out.println("您输入的字符串中没有大写字母。请重新输入：");
                continue;
            }
        }

    }

    public static boolean findBigChar(String s) {
        //实现看一个功能___如果没有大写字母,就返回false,如果有大写字母返回true

        boolean yes;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                count++;
            }
        }
        if (count == 0) {
            yes = false;
        } else {
            yes = true;
        }
        return yes;

    }
}
