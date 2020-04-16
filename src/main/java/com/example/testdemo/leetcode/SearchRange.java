package com.example.testdemo.leetcode;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
      if(nums==null){
          return new int[]{-1,-1};
      }
      //寻找最左边界
        int left = searchLeftTarget(nums,target);
      //寻找最右边界
        int right =  searchRightTarget(nums,target);
        return new int[]{left,right};
    }
    public int searchTarget(int[] goal,int target){
        int left = 0;
        int right = goal.length-1;
        while (left<=right){
            int middle = left+(right-left)/2;
            if(goal[middle]==target){
                return middle;
            }else if(goal[middle]<target){
                left=middle+1;
            }else {
                right=middle+1;
            }
        }
        return -1;
    }
    //模板
    public int searchLeftTarget(int[] nums,int target){
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length; // 注意
        while (left<right){
            int middle = left+(right-left)/2;
            if(nums[middle]==target){
                right=middle;
            }else if(nums[middle]<target){
                left=middle+1;
            }else if (nums[middle]>target){
                right=middle;
            }
        }
        return left;
    }
    //模板
    public int searchRightTarget(int[] nums,int target){
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length; // 注意
        while (left<right){
            int middle = left+(right-left)/2;
            if(nums[middle]==target){
                left=middle+1;
            }else if(nums[middle]<target){
                left=middle+1;
            }else if (nums[middle]>target){
                right=middle;
            }
        }
        return left-1;
    }
}
