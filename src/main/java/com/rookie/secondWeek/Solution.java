package com.rookie.secondWeek;


/**
 * @创建人 rookie
 * @创建时间 2019/6/2
 * @描述
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target){


        for (int i=0; i<nums.length; i++){

            for(int j =1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int[] result = new int[]{i,j};
                    return result;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5};
        int[] result = twoSum(nums,3);
        System.out.println(twoSum(nums,3));
    }
}
