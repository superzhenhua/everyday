package arr;

/*
    需求:
        求一个数组的最值
 */
public class Demo1 {
    public static void main(String[] args) {

        //定义数组
        int [] arr = {1,14,34,544,35};
        //求最大值
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}