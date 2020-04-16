package com.example.testdemo.leetcode;

/**
 * 寻找旋转排序数组中的最小值
 */
public class FindMin1 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int middle = left+(right-left)/2;
            //首次进来
            if(nums[middle]>nums[right]){
                left=middle+1;
            }else{
                right=middle;
            }
        }
        return nums[left];
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {2,1};
        System.out.println(new FindMin1().findMin(nums2));
    }
}
