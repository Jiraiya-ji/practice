package com.example.testdemo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 */
public class ContainsNearbyDuplicate {
    //暴力法
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||nums.length<1){
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]&&i+j<=k){
                    return true;
                }
            }
        }
        return false;
    }
    //hash 法
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        if(nums==null||nums.length<1){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k){
                    return true;
                }
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
    //窗格法
}
