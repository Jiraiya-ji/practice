package com.example.testdemo.leetcode;

/**
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 *
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 *
 * 如果是，则返回最大元素的索引，否则返回-1。
 */
public class DominantIndex {
    public int dominantIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int maxNumber = nums[0];
        int goal = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>maxNumber){
                maxNumber=nums[i];
                goal=i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=maxNumber&&maxNumber/2<nums[i]){
                return -1;
            }
        }
        return goal;
    }
}
