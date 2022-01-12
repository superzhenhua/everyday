package come.itheima;

import java.util.Random;

/*
  生成一个指定长度,指定范围的随机数组 int[] getArray(int 长度,int 起始数据,int 结束数据);

        生成一个指定长度,指定范围的随机数组
            明确1:返回值类型 -> int[]
            明确2:参数列表 -> int length,int start,int end

   */
public class 案例_指定范围随机数组 {
      public static void main(String[] args) {
            // 生成一个新随机数组
            int[] arr = getRandomArr(5, 50, 1);
            //遍历
            for (int i = 0; i < arr.length; i++) {
                  System.out.println(arr[i]);
            }
      }
      //定义方法
      public static int[] getRandomArr(int length ,int max,int min){
        //动态初始化指定长度的数组
            int [] arr = new int[length];
            //遍历
            for (int i = 0; i < arr.length; i++) {
                  //给元素赋随机值
                  arr[i]= new Random().nextInt(max-min+1)+min;
            }
            //返回数组
            return arr;
      }

}
