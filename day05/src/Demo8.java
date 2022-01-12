//需求:设计一个方法用于获取数组中元素的最大值,调用方法并输出结果
public class Demo8 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {12, 23, 354, 65, 67, 8};
        //调用方法接收
        int numb= max(arr);
        //打印结果
        System.out.println("max:"+numb);
    }

    //定义一个方法
    public static int max(int[] arr) {
        //定义最大值max
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }
}

