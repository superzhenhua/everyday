package day05.重点案例;

public class 快排 {
    public static void main(String[] args) {
        //定义一个数组
        int[]arr={6,1,2,7,9,3,4,5,10,8};
     quickSort(arr,0,arr.length-1);
     //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
       if(left>right){
           return;
       }
        int left0 =left;
        int right0 =right;
        //计算基准数
        int baseNumb =arr[left0];
        //
        while (right!=left){
            while (arr[right]>=baseNumb&&right>left){
                right--;
            }
            while (arr[left]<=baseNumb&&right>left){
                left++;
            }
            //交换位置
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        //基准数归位
        int temp =arr[left];
        arr[left]=arr[left0];
        arr[left0]=temp;

        quickSort(arr,left0,left-1);
        quickSort(arr,left+1,right0);

    }
}
