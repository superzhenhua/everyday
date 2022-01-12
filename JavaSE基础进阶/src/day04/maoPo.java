package day04;

public class maoPo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {2, 4, 1, 5, 3};
        //相邻两个数进行比较,较大值放到数组最后一个位置,循环次数比数组长度-1,每次比较完最后一个元素不参与下一次比较
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    //用第三方变量做位置交换
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        //遍历打印排序结束的数组并打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }

    }
}
