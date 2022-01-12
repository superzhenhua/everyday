package day04.重点案例;

public class 冒泡排序 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1, 2, 5, 73, 3};

        //相邻两个元素进行比较,将较大值放在右边,每次循环结束最后一个元素不参与下次运算,循环轮次为数组长度-1.
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                //利用第三方变量换位
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        //遍历调换位置的数组并打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
