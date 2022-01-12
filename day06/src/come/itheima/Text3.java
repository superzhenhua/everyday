package come.itheima;

import java.util.Random;

/*
  生成一个指定长度,指定范围的随机数组 int[] getArray(int 长度,int 起始数据,int 结束数据);

        生成一个指定长度,指定范围的随机数组
            明确1:返回值类型 -> int[]
            明确2:参数列表 -> int length,int start,int end

   */
public class Text3 {
    public static void main(String[] args) {
        //赋值调用,生成随机数组
        int[] randomArr = ArraryTools.getRandomArr(5,5,60);
        //遍历
        for (int i = 0; i < randomArr.length; i++) {
            System.out.println(randomArr[i]);
        }
    }
    //定义方法
    public static int[] getArray(int length ,int start ,int end){
        //指定数组长度
        int [] arr = new int[length];
        //遍历
        for (int i = 0; i < arr.length; i++) {
            //给元素赋予随机值
          arr[i] = new Random().nextInt(start-end+1)+start;
        }
        //返回随机数组
        return arr;
    }
}
