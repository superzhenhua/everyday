package come.itheima;

import java.util.Arrays;
import java.util.Random;

public class 找出最大的被随机数整除的五个数 {
    public static void main(String[] args){
        int num = new Random().nextInt(41)+1;
        int[] arr = new int[200];
        int nums= 1001;
        for(int i=0;i<=199;i++ ){
            arr[i]=nums;
            nums++;
        }
        int[] res=getNums(arr,num);
        System.out.println(res.toString());

    }
    public static int[] getNums(int[] arr, int num){
        int[] temp = new int[200];
        int index_temp=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%num==0){
                temp[index_temp]=arr[i];
                index_temp++;
            }
        }
        Arrays.sort(temp);
        int[] res = new int[5];
        int index_res = -1;
        for(int i = temp.length-6;i<=temp.length;i++){
            index_res++;
            res[index_res]=temp[i];

        }
        return res;

    }
}

