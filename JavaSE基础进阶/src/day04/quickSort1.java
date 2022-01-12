package day04;

public class quickSort1 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        //
        quickSort(arr, 0, arr.length - 1);
        //遍历打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        //递归出口
        if(right<left){
            return;
        }
        //基准数提前赋值
        int left0 = left;
        int right0 = right;
        //定义基准数
        int baseNum = arr[left0];
        while (right != left) {
            //从右边开始找,如果比基准数大,索引--
            while (arr[right] >= baseNum && right > left) {
                right--;
            }
            //从左边开始找,如果比基本数小,索引++
            while (arr[right] <= baseNum && right > left) {
                left--;
            }
            //调换位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        }
        //基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;

        //递归调用方法
        quickSort(arr,left0,left-1);
        quickSort(arr,left+1,right0);

    }
}
