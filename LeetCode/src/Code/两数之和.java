package Code;

import java.util.Arrays;


/*
给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案。

 */
public class 两数之和 {
    public static void main(String[] args) {
         int[]nums ={2,7,11,15};
         int target = 9;
        //调用方法接收
        speedTest.SpeedTest.test01();
        int[] ints = TwoSum(nums,9);
        System.out.println(Arrays.toString(ints));
        speedTest.SpeedTest.test01();


    }

    //定义方法
    public static int[] TwoSum(int[] nums, int target) {
        int []arr =new int[2];
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1 + i; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                         return new int[]{i,j};
                }
            }
        }
        return arr;
    }
}


