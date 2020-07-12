package com.example.testdemo.leetcode;

import java.util.Arrays;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 */
public class SearchInsert1 {
    //普通方法
    public int searchInsert(int[] nums, int target){
        if(nums==null||nums.length<1){
            return 0;
        }
        //可以优化
        Arrays.sort(nums);
        //最小
        if (target<nums[0]){
            return 0;
        }
        //最大
        if (target>nums[nums.length-1]){
            return nums.length;
        }
        //二分法
        int low = 0;
        int high = nums.length-1;
        while (low<high){
            int mid = (high+low)/2;
            if(target>nums[mid]){
                low = mid+1;
            }else if(target<nums[mid]){
                high = mid-1;
            }else {
                return mid;
            }
        }
        return low;
    }
}
