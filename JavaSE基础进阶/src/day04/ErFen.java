package day04;

public class ErFen {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num =5;
        //调用方法
        int index= getErFen(arr, num);
        System.out.println(index);
    }
    //定义查找方法
    private static int getErFen(int[] arr, int num) {
        //定义查找范围
        int min = 0;
        int max = arr.length - 1;
        //循环查找min<=max
        while (min <= max) {
            //计算中间位置
            int mid = (min + max) >> 1;
            //mid指向元素大于num,说明在左边
            if (arr[mid] > num) {
                max = mid - 1;
                //mid指向元素小于numb,说明在右边
            } else if (arr[mid] < num) {
                min = mid + 1;
            }else{
                //mid指向元素等于numb
                return mid;
            }
        }
        //如果min大于max,表示不存在,返回-1
        return -1;
    }


}
