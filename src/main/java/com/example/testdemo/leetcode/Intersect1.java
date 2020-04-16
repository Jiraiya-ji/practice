package com.example.testdemo.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 */

public class Intersect1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length<1||nums2.length<1){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(nums2[i]==list.get(j)){
                    list1.add(nums2[i]);
                    list.remove(j);
                    break;
                }
            }
        }
        int[] goalNums = new int[list1.size()];
//        list1.forEach(e -> {
//            goalNums[i] = e;
//        });
        for (int j = 0; j < list1.size(); j++) {
            goalNums[j] = list1.get(j);
        }
        return goalNums;
    }
    public int[] intersect1(int[] nums1, int[] nums2) {
        if(nums1.length<1||nums2.length<2){
            return new int[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0,j = 0,k = 0;
        while(i < nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums1[j]){
                j++;
            }else {
                nums1[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
        public static void main(String[] args){
        Intersect1 intersect1 = new Intersect1();
        int[] nums1 = {1,2};
        int[] nums2 = {1,2,2,1};
        intersect1.intersect(nums1,nums2);
    }
}
