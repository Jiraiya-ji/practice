package com.example.testdemo;

import com.example.testdemo.leetcode.RemoveDuplicates;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 */
public class Rotate1 {
    public void rotate1(int[] nums, int k) {
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            nums1[(i+k)%nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums1[i];
        }

    }
    public void rotate(int[] nums, int k) {
        if(nums.length<1){
            return;
        }
        for (int i = 0; i < k; i++) {
            int next = nums[0];
            for (int j = 0; j < nums.length; j++) {
                if(j+1<nums.length){
                    int mid = nums[j+1];
                    nums[j+1] = next;
                    next = mid;
                }else {
                    nums[0] = next;
                }
            }
        }
    }
    public static void main(String[] args){
        Rotate1 removeDuplicates = new Rotate1();
        int[] nums1 = {1,2,3,4,5,6,7};
        removeDuplicates.rotate1(nums1,3);
    }
}
