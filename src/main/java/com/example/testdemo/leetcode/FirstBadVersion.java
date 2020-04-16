package com.example.testdemo.leetcode;

/**
 * 第一个错误的版本
 */
public class FirstBadVersion {
//    public int firstBadVersion(int n) {
//        if(n==1&&isBadVersion(1)==false){
//            return 1;
//        }
//        int left = 1;
//        int right = n;
//        int middle = left+(right-left)/2;
//        while (left<=right){
//            if(isBadVersion(middle)==true){
//                if(isBadVersion(middle+1)==false){
//                    return middle+1;
//                }else {
//                    left=middle+1;
//                }
//            }else {
//                if(isBadVersion(middle-1)==true){
//                    return middle;
//                }else {
//                    right=middle-1;
//                }
//            }
//            middle=left+(right-left)/2;
//        }
//        return -1;
//    }
public void sortColors(int[] nums) {
    int red = 0;
    int blue = nums.length-1;
    for (int j = 0; j < nums.length; j++) {
        if(nums[j]==0){
            int swap = nums[red];
            nums[red] = nums[j];
            nums[j] = swap;
            red++;
        }
    }
    for (int j = nums.length-1; j >red; j--) {
        int swap = nums[blue];
        nums[blue]=nums[j];
        nums[j] = swap;
        blue--;
    }
}
}
