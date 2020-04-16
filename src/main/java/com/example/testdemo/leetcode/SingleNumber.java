package com.example.testdemo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 双重 for 循环 Map
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int goalNumber = 0;
        HashMap<Integer,Integer> singleNumberHashMap = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(singleNumberHashMap.containsKey(nums[i])){
                singleNumberHashMap.replace(nums[i],2);
            }else {
                singleNumberHashMap.put(nums[i],1);
            }
        }
        for (int i : singleNumberHashMap.keySet()) {
            if(singleNumberHashMap.get(i)==1){
                goalNumber = i;
            }
        }
        return goalNumber;
    }
    public int singleNumber1(int[] nums) {
        int goalNumber = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            if(list.contains(nums[i])){
                goalNumber=goalNumber - nums[i];
            }else {
                list.add(nums[i]);
                goalNumber = goalNumber + nums[i];
            }
        }
        return goalNumber;
    }

    }
