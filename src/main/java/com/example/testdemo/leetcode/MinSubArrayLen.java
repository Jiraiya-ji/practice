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
        int right = 0;
        int sum = 0;
        int size = nums.length;
        while (right<nums.length){
            if(sum>=s){
                if(right-left+1<size){
                    size=right-left+1;
                }
                sum-=nums[left];
                left++;
            }else {
               right++;
               sum+=nums[right];
            }
        }
        return size;

    }
    public static void main(String[] args){

    }
}
