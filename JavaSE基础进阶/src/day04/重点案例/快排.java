package day04.重点案例;

//实现快速排序
public class 快排 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        //调用方法
        quiteSort(arr, 0, arr.length - 1);
        //遍历打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quiteSort(int[] arr, int left, int right) {
        if(left>right){
            return;
        }

        //将left和right做临时存储
        int left0 = left;
        int right0 = right;

        //计算默认基准数
        int baseNumb = arr[left0];

        while (left != right) {
            //从右边开始找比基准数小的,如果大于基准数索引--
            while (arr[right] >= baseNumb && right > left) {
                right--;

            } //从左边开始找比基准数大,如果小于基准数索引++
            while (arr[left] <= baseNumb && right > left) {
                left++;
            }
            //交换两个值的位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        }//基准数归为
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        quiteSort(arr,left0,left-1);
        quiteSort(arr,left+1,right0);

    }
}
