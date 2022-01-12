package com.itheima;



import java.util.Random;

/*

        遍历打印 void printArray(int[] arr)
        元素和 int getSum(int[] arr)
        元素平均值 double getAvg(int[] arr)
        最大值 int getMax(int[] arr)
        最小值 int getMin(int[] arr)
        元素基本查找 int getIndex(int[] arr,int num);
        生成一个指定长度,指定范围的随机数组 int[] getArray(int 长度,int 起始数据,int 结束数据);

        自动生成返回值 -> Ctrl + Alt + V
 */
public class 案例8_数组综合案例 {
    public static void main(String[] args) {
        // 生成一个随机数组
        int[] arr = getArray(5, 1, 50);

        // 遍历数组
        printArray(arr);

        System.out.println("---------------");

        // 测试其他方法 -> 打印调用
        System.out.println("sum:" + getSum(arr));
        System.out.println("avg:" + getAvg(arr));
        System.out.println("max:" + getMax(arr));
        System.out.println("min:" + getMin(arr));

        System.out.println("---------------");

        // 基本查找
        int index = getIndex(arr, 10);
        // 判断返回值
        if (index == -1) {
            System.out.println("不存在");
        } else {
            System.out.println("数据的索引是" + index);
        }
    }

    // 遍历元素 void printArray(int[] arr)
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 元素和 int getSum(int[] arr)
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 元素平均值 int getAvg(int[] arr)
    public static int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    // 最大值 int getMax(int[] arr)
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 最小值 int getMin(int[] arr)
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /*
        元素基本查找 int getIndex(int[] arr,int num);
            在一个数组中,找一个指定的数据
                存在,返回该数据对应的索引
                不存在,返回-1
     */
    public static int getIndex(int[] arr, int num) {
        // 定义变量index用于记录索引
        int index = -1;
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 如果当前元素,和num一样,记录索引
            if (arr[i] == num) {
                index = i;
                break; // 如果找到了,循环停止
            }
        }
        // 循环结束,返回index
        return index;
    }

    /*
        生成一个指定长度,指定范围的随机数组
            明确1:返回值类型 -> int[]
            明确2:参数列表 -> int length,int start,int end
     */
    public static int[] getArray(int length, int min, int max) {
        // 动态初始化指定长度的数组
        int[] arr = new int[length];
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 给元素赋随机值
            arr[i] = new Random().nextInt(max - min + 1) + min; //(max - min + 1) + min
        }
        // 返回数组
        return arr;
    }
}

