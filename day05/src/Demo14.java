//需求:定义一个方法,遍历int类型的数组

public class Demo14 {
    public static void main(String[] args) {
        //定义数组
        int[]arr = {1,2,3,4,5};
        //调用方法
        printArr(arr);
    }
    //定义方法
    public static  void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
