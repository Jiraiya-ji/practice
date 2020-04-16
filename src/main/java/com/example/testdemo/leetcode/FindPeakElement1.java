package com.example.testdemo.leetcode;

/**
 * 寻找峰值
 */
public class FindPeakElement1 {
    //暴力法
    public int findPeakElement(int[] nums) {

        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(pre>nums[i]){
                return i-1;
            }else {
                pre = nums[i];
            }
        }
        return nums[nums.length-1];
    }
    public int findPeakElement1(int[] nums) {
        int left = 0, right = nums.length - 1;
        for (; left < right; ) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
