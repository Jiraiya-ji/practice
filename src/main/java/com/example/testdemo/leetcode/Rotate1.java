package com.example.testdemo.leetcode;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Rotate1 {
    //方法一
    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length<0){
            return;
        }
        int previous = nums[nums.length-1];
        int mid = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length; j++) {
                mid = nums[j];
                nums[j] = previous;
                previous = mid;
            }
        }
    }
}
