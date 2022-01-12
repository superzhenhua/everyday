package arr;

import java.util.Scanner;

/*
    需求:
        数组元素的基本查找,元素自拟
        要求存在则打印元素的索引,不存在打印-1
 */
public class Demo3 {
    public static void main(String[] args) {
        //定于数组
        int[] arr = {12, 32, 43, 45, 46};
        //提示
        System.out.println("请输入你要查找的元素");
        //键盘录入并接收
        int num = new Scanner(System.in).nextInt();
        //定义索引index
        int index = -1;
        //遍历
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        //循环结束,判断index的结果
        if (index == -1) {
            System.out.println("您输入的元素" + num + "在数组中不存在");
        } else {
            System.out.println("您输入的元素" + num + "在数组中为:" + index);
        }
    }
}