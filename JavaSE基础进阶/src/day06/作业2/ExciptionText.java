package day06.作业2;

import day06.AgeErrorExciption;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

// 键盘录入学生的姓名和年龄,其中年龄为 18 - 25岁,
// 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止。
public class ExciptionText {
    public static void main(String[] args) {

        //创建键盘对象
        Scanner sc= new Scanner(System.in);
        //创建学生对象
        Student stu =new Student();
        //提示录入
        System.out.println("请输入姓名");
        String name = sc.next();
        stu.setName(name);

        while (true) {
            System.out.println("请输入年龄");
            String ageStr = sc.next();
            try {
                int age = Integer.parseInt(ageStr);//数据类型转换异常
                stu.setAge(age);//年龄范围异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
            }catch (AgeErrorExciption e) {
                System.out.println("请输入在范围内的年龄");
            }
        }

        System.out.println(stu);
    }

}
