package arr;

import java.util.Scanner;

/*
    需求:
        数组元素的基本查找,元素自拟
        要求存在则打印元素的索引,不存在打印-1
 */
public class Demo4 {
    public static void main(String[] args) {
        //定义数组
        int [] arr= {12,13,14,15,16,17,18,15,56,90,14,31,36};
        //定义索引
        int index=-1;
        //提示
        System.out.println("请输入要查找的元素");
        //创建键盘对象,收集数据
        int num = new Scanner(System.in).nextInt();
        //遍历
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                index = i;
                break;
            }
        }
        //判断索引index
        if(index==-1){
            System.out.println("您查询的元素"+num+"在数组中不存在");
        }else{
            System.out.println("您查询的元素"+num+"在数组中为:"+index);
        }
    }
}
