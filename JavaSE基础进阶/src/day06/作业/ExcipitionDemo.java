package day06.作业;

import day06.AgeErrorExciption;

import java.util.Scanner;

// 键盘录入学生的姓名和年龄,其中年龄为 18 - 25岁,
// 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止。
public class ExcipitionDemo {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc =new Scanner(System.in);
        //创建学生对象S
        Studnet stu =new Studnet();
        //提示录入
        System.out.println("请输入姓名");
        String name = sc.next();
        stu.setName(name);
        while (true) {
            System.out.println("请输入年龄");
            String ageStr = sc.next();
            try {
                int age = Integer.parseInt(ageStr);// 数字类型异常
                stu.setAge(age);//数字范围异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
                continue;
            }catch (AgeErrorExciption e) {
                System.out.println("请输入一个符合范围的年龄");
                continue;
            }
        }
        System.out.println(stu);


    }

}
