package com.example.testdemo.leetcode;

/**
 *  给定一个二进制数组， 计算其中最大连续1的个数。
 */
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null||nums.length<1){
            return 0;
        }
        int size = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                left = i+1;
            }
            //长度
            if(i-left+1>size){
                size=i-left+1;
            }
        }
        return size;
    }
}
