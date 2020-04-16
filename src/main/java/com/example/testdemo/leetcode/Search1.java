package com.example.testdemo.leetcode;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class Search1 {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length<0){
            return -1;
        }
        int low = 0;
        int high= nums.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target<nums[mid]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
}
