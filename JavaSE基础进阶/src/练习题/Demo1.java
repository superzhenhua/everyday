package 练习题;

import java.util.Scanner;

/*创建一个长度为5的数组，存入3个学生对象。
要求1：学生对象的属性为，姓名String，年龄int，语文成绩int，数学成绩int，英语成绩int。
要求2：学生对象所有的数据均使用nextLine，由键盘录入获取。
要求3：年龄键盘录入之后需要进行类型转换，由字符串变成int，并判断是否为10~20之间，否则重新输入
要求4：语文成绩，数学成绩，英语成绩数据，需要进行类型转换，由字符串变成int，并判断是否为0~100之间，否则重新输入。
要求5：打印总分最高的学生信息*/
public class Demo1 {
    public static void main(String[] args) {
        //创建一个长度为5的数组
        Student [] stu =new Student[5];

        //键盘录入三个学生
        for (int i = 0; i < 3; i++) {
            Student student = null;
            while (true) {
                try {
                    student = getStudent();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("请重新录入,成绩和年龄一定要录入整数");
                }
            }
            stu[i]=student;
        }
        //打印总分最高的学生信息 ,求出总分最高的学生
        Student maxStu = stu[0];
        for (int i=1;i<stu.length;i++){
            //判断 maxStu的总分和 students[i]这个学生的总分谁高
            if (stu[i]!=null){
                if (maxStu.getScoreSum()<stu[i].getScoreSum()){
                    //当前maxStu学生总分不是最大的，重新赋值
                    maxStu = stu[i];
                }
            }
        }

        System.out.println(maxStu);



    }


    //定义一个获取学生的类,从键盘录入一个学生并返回
    public static Student getStudent(){
        //创建键盘对象
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        int age=-1;
        while (true) {
            System.out.println("请输入年龄");
            String agestr=sc.nextLine();
            age = Integer.parseInt(agestr);
            if(!(age>=10&&age<=20)){

                System.out.println("请重新输入");
                continue;
            }else{
                break;
            }
        }
        //录入语文成绩
        int chineseScore = getScore("语文", sc);
        int mathScore = getScore("数学", sc);
        int englishScore = getScore("英语", sc);

        //创建学生对象
        Student student =new Student(name,age,chineseScore,mathScore,englishScore);
        return student;

    }

    //定义一个获取成绩的方法
    public static int getScore( String classes,Scanner sc){
        int score=-1;
        //语文成绩，数学成绩，英语成绩数据，需要进行类型转换，由字符串变成int，并判断是否为0~100之间，否则重新输入。
        while (true) {
            System.out.println("请输入"+classes+"成绩");
            String scoreStr = sc.nextLine();
           score = Integer.parseInt(scoreStr);
            if (score>=0&&score<=100) {
              break;
            }else {
                System.out.println("请重新录入");
                continue;
            }
        }
        //返回成绩
        return score;
    }
}
