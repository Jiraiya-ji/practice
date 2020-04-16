package com.example.testdemo.leetcode;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.equals("")){
            return 0;
        }
        int length = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[length]!=nums[i]){
                length++;
                nums[length]=nums[i];
            }
        }
        return length+1;
    }
    public static void main(String[] args){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums1 = {1,2,2,3};
        System.out.println("the nums is ："+nums1.toString()+"the length is :"+removeDuplicates.removeDuplicates(nums1));
    }
}