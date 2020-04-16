package com.example.testdemo.Interview;


/**
 *  此算法为原地删除,给定一个数组，原地删除这个数，并返回
 *
 *  【1，2，3，3，4】——》[1,2,4,3,3]
 *
 */
public class LocalRemove {
    public void solution(int[] nums,int target){
        //
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==target){
                nums[i]=nums[i+1];
            }
        }
    }
}
