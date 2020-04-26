package com.example.testdemo.leetcode;

import java.util.Arrays;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 */
public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums==null||nums.length<0){
            return 0;
        }
        int left = 0;
        int sum = 0;
        int size = nums.length;
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while (sum>=s){
                flag = false;
                if(i-left+1<size){
                    size=i-left+1;
                }
                sum-=nums[left];
                left++;
            }
        }
        return flag==false?size:0;
    }
    public static void main(String[] args){
        int[] nums = {3,1,2,4,3};
        MinSubArrayLen m = new MinSubArrayLen();
        m.minSubArrayLen(7,nums);
    }
}
