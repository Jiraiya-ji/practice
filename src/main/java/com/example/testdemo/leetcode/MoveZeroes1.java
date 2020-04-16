package com.example.testdemo.leetcode;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class MoveZeroes1 {
    public void moveZeroes(int[] nums) {
        if(nums.length<1){
            return;
        }
        for (int j = 0; j < nums.length ; j++) {
            for (int i = 0; i < nums.length -1; i++) {
                    if(nums[i]==0){
                        int middle = nums[i];
                        nums[i] = nums[i+1];
                        nums[i+1] = middle;
                    }
            }
        }
    }

    /**
     * laji
     * @param nums
     */
    public void moveZeroes1(int[] nums) {
        if(nums.length<1){
            return;
        }
        int middle = nums.length;
        int flag = 1;
        for (int j = nums.length-middle; j < middle ; j++) {
            for (int i = 0; i < middle-1; i++) {
                if(nums[i]==0){
                    int mid = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = mid;
                }else {
                    flag = 0;
                }
            }
            middle = middle-flag;
        }
    }

    /**
     * 原位数组保持不变
     * @param nums
     */
    public void moveZeroes2(int[] nums) {
        int mid = 0;
        int numOfZero = 0;
        for(int num:nums ){
            if(num!=0){
                nums[mid++] = num;
            }else {
                numOfZero++;
            }
        }
        for (int j = nums.length-1;j>=nums.length-numOfZero;j--){
            nums[j] = 0;
        }
    }
}
