package com.example.testdemo.leetcode;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length<2){
            return new int[0];
        }
        int[] targetNums = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])){
                targetNums[0] = hashMap.get(nums[i]);
                targetNums[1] = i;
                break;
            }
            hashMap.put(target - nums[i],i);
        }
        return targetNums;
    }
}
