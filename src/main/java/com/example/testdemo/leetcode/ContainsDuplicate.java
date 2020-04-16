package com.example.testdemo.leetcode;

import java.util.Collections;
import java.util.HashMap;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<1){
            return false;
        }
        boolean flag = false;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i])){
                flag = true;
            }
            hashMap.put(nums[i],i);
        }
        return flag;
    }
}