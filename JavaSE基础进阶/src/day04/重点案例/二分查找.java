package day04.重点案例;

public class 二分查找 {
    public static void main(String[] args) {
        //定义一个有序的数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //定义一个要查找的数
        int num = 4;
        //调用二分查找的方法:有返回值返回的值是索引,需要将数组和查找的数传递入方法中
        int index = getErFen(arr, num);
        System.out.println(index);

    }
    //定义二分查找方法
    private static int getErFen(int[] arr, int num) {
        //定义查找范围
        int max = arr.length - 1;
        int min = 0;
        //循环查找min<=max,否则返回-1
        while (min <= max) {
            //计算mid位置
            int mid = (max + min) >> 1;
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
