package com.Text;

public class UesrText {
    public static void main(String[] args) {
        //创建三个对象
        User s1 = new User("张三",12,"打洞洞");
        User s2 = new User("李四",23,"睡觉");
        User s3 = new User("王五",38,"吃饭");
        //定义数组
        User[]arr={s1,s2,s3};
        //定义求和
        int sum= 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //计算年龄和
            sum += arr[i].getAge();
        }
        //打印年龄和
        System.out.println("sum:"+sum);


        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()<18){
                arr[i].setHobby("敲代码");
            }
        }

        //遍历修改后的数组,打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName()+
                    "..."+arr[i].getAge()+"..."+arr[i].getHobby());
        }

    }
}
