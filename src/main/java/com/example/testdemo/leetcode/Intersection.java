package com.example.testdemo.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null){
            return nums2;
        }
        if(nums2==null){
            return nums1;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        int number =0;
        for (int i = 0; i <nums2.length ; i++) {
            if(set.contains(nums2[i])){
                nums2[number]=nums2[i];
                set.remove(nums2[i]);
                number++;
            }
        }
        return Arrays.copyOfRange(nums2,0,number);
    }
}
