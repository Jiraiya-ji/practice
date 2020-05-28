package com.example.testdemo.leetcode;

import java.util.Arrays;

/**
 * 矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列
 */
public class SearchMatrix {
    //暴力法
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    //二分法
    public boolean searchMatrix1(int[][] matrix,int targrt){
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0]>targrt){
                return false;
            }
            if (Arrays.binarySearch(matrix[i],targrt)>=0){
                return true;
            }
        }
        return false;
    }
    //去除区域
    public boolean searchMatrix2(int[][] matrix,int target){
//        if(matrix==null||matrix.length==0||matrix[0].length==0){
//            return false;
//        }
//        //找到中心坐标
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int middle = matrix[(m+1)/2][(n+1)/2];
//        if(middle>target){
//            for (int i = 0; i < (m+1)/2-1; i++) {
//                for (int j = 0; j < (n+1)/2-1; j++) {
//                    if(matrix[i][j]==target){
//                        return true;
//                    }
//                }
//            }
//        }else {
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//
//                }
//            }
//        }
        return false;
    }
}
