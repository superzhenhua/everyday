package come.itheima;

import java.util.Random;
import java.util.Scanner;
/*
    工具类设计思想:
        1.不让外界创建本类的对象 -> 私有空参构造
        2.所有的方法使用静态修饰 -> 让外界通过类名调用所有的方法

    提供对数组的常见操作
        void printArr(int[] arr)
        int getSum(int[] arr)
        int getAvg(int[] arr)
        int getMax(int[] arr)
        int getMin(int[] arr)
        int getIndex(int[] arr,int num)
        int[] getRandomArr(int length,int bounds)
        int[] getScannerArr(int length)
 */
public class ArraryTools {
    private ArraryTools() {
    }

    //遍历数组 void printArr(int[] arr)
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //元素和   int getSum(int[] arr)
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //元素平均值 int getAvg(int[] arr)
    public static int getAvg(int[] arr) {
        int avg = getSum(arr) / arr.length;
        return avg;
    }

    //最大值   int getMax(int[] arr)
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //最小值   int getMin(int[] arr)
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /*
    元素基本查找 int getIndex(int[] arr,int num);
        在一个数组中,找一个指定的元素
            存在,返回该数据对应的索引
            不存在,返回-1
     */
    public static int getIndex(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    /*
    生成一个指定长度,指定范围的随机数组
        明确1:返回值类型->int[];
        明确2:参数列表->int length,int min;int max
     */
    public static int[] getRandomArr(int length,int min,int max){
        Random r = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(max-min+1)+min;
        }
        return arr;
    }
    /*
    生成一个数组,长度由调用者指定,元素通过键盘录入
        明确1:返回值类型->int[];
        明确2:参数列表->int length
     */
    public static int[] getScannerArr(int length){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请录入第"+(i+1)+"个元素");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
