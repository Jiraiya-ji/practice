package com.example.testdemo.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 */
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        if(nums==null||nums.length<1){
            return sum;
        }
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0){
                sum+=nums[i];
            }
        }
        return sum;
    }
}
