import javax.crypto.spec.PSource;
import java.util.Collection;

public class Demo15 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5};
        //调用方法,接收返回的新数组
        int[] newArr = getMaxAndMin(arr);
        //打印
     //   System.out.println(newArr[0]);
      //  System.out.println(newArr[1]);
        //遍历
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    //定义一个方法getMaxAndMin
    public static int[] getMaxAndMin(int[] arr) {
        //获取数组并将max 和min数组放入新的数组中
        int max =arr [0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        int min =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }

        }
        //将数组max 和 min放入一个新的数组内
        //定义静态数组初始化
            int[] newArr = {max, min};
            return newArr;
    }

}
