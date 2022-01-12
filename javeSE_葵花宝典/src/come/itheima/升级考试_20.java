package come.itheima;

import java.util.Scanner;

/*
提示用户键盘录入一个包含数字和字母的字符串（不做是否包含数字和字母的判断），
遍历字符串分别筛选出数字和字母（如有符号不包含在字母里），
按照数字在前字母在后的规则组成一个新的字符串，
把组成的新字符串打印在控制台。
例如
 */
public class 升级考试_20 {
    public static void main(String[] args) {
        //提示用户录入字符串
        System.out.println("请输入一个字符串(必须包含数字和字母)");
        //创建键盘对象并接收
        String s = new Scanner(System.in).next();
        //创建两个sb容器用来装
        StringBuilder zimu = new StringBuilder();
        StringBuilder shuzi = new StringBuilder();
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //获取每个字符
            char c = s.charAt(i);
            //筛选
            if (c >= '0' && c <= '9') {
                shuzi.append(c);
            } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                zimu.append(c);
            }
        }
        System.out.println(shuzi.append(zimu));
    }
}
