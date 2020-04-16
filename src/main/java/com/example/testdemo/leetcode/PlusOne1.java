package com.example.testdemo.leetcode;

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne1 {
    public int[] plusOne(int[] digits) {
        int middleNum = 1;
        for (int i = digits.length-1; i >= 0 ; i--) {
            //最后特殊处理
            if (i==0&&middleNum==1&&digits[0]==9){
                digits[0] = 0;
                int[] nums = new int[digits.length+1];
                nums[0] = 1;
                for (int j = 0; j < digits.length; j++) {
                    nums[j+1] = digits[j];
                }
                return nums;
            }
            if(middleNum+digits[i]==10){
                digits[i] = 0;
                middleNum = 1;
            }else {
                digits[i]=digits[i]+middleNum;
                middleNum = 0;
            }
        }
            return digits;
    }
}