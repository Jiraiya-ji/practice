package com.example.testdemo.leetcode;

/**
 * 给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
 */
public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix) {
       if(matrix==null||matrix.length<0){
           return new int[0];
       }
       int yLength = matrix.length;
       int xLength = matrix[0].length;
       int size = xLength*yLength;
       int nums[] = new int[size];
       int x =0,y=0;
       //控制球的走向
       boolean flag = true; //true 向上走  false 向下走
        for (int i = 0; i < size; i++) {
            nums[i] = matrix[y][x];
            //走到边界
            if(y==0){
                x++;
                flag = false;
                continue;
            }
            //走到边界
            if(x==0){
                y++;
            }
            //走到边界
            if(x==xLength-1){

            }
            //走到边界
            if(y==yLength-1){

            }
            //如何判断球向上还是向下
            if(flag){
                x++;
                y++;
            }else {
                x--;
                y++;
            }
        }
        return nums;
    }
}
