package com.example.testdemo.leetcode;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 */
public class SearchX {
    //依旧能取得中间的索引
    //1.处于前半段  2.处于后半段 只需看该索引和最后末位比较
    //那接下来就是看输入的数字与中间的索引比较
    //如果大于，正好位于小的，二分||无限二分
    //如果小于，正好位于大的，二分||
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low<=high){
            int middle = low + (high-low)/2;
            if(nums[middle] ==target){
                return middle;
            }
            if(nums[middle] >=nums[high]){
                if(nums[middle] >= target&&nums[low]<=target) {
                    high = middle - 1;
                }else {
                    low=middle+1;
                }
            }else {
                if(nums[middle] <= target&&nums[high]>=target) {
                    low = middle + 1;
                }else {
                    high=middle-1;
                }
            }
        }
        return -1;
    }
}
