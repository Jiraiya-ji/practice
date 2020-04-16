package com.example.testdemo.leetcode;

import java.util.Arrays;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**
 * 寻找数组的中心索引
 *
 * 需特别注意数组是否存在多个中心索引
 */
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        //处理 null 空
        if(nums==null||nums.length<1){
            return -1;
        }
        //求和 sum
//        Integer sum = Arrays.asList(nums).stream().mapToInt(Integer[]::1).sum();
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        //移动
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = sum -left -nums[i];
            if(right==left){
                return i;
            }else {
                left+=nums[i];
            }
        }
        return -1;
    }
}
