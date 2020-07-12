package com.example.testdemo.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。
 *
 * 给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。
 *
 * 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。
 *
 * 最后返回经过上色渲染后的图像。
 *
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // 条件判断（边界判断，其他要求的判断）
        if (image == null || image.length == 0 || image[0].length == 0 || image[sr][sc] == newColor) return image;
        Integer[] numbers = new Integer[]{sr,sc};
        Integer target = image[sr][sc];
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(numbers);
        while (!queue.isEmpty()){
            Integer[] out = queue.poll();
            int row = out[0];
            int line = out[1];
            if(line>=0&&line<image[0].length&&row>=0&&row<image.length&&image[row][line]==target){
                image[row][line]=newColor;
                queue.add(new Integer[]{row,line-1});
                queue.add(new Integer[]{row,line+1});
                queue.add(new Integer[]{row-1,line});
                queue.add(new Integer[]{row+1,line});
            }
        }
        return image;
    }
    public int[][] floodFill1(int[][] image, int sr, int sc, int newColor) {
        //不满足条件，退出
        if(image == null || image.length == 0 || image[0].length == 0 || image[sr][sc] == newColor){
            return image;
        }
        int target = image[sr][sc];
        dfs(image,sr,sc,newColor,target);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int newColor,int target){
        //不满足条件，退出
        if(!(sr>=0&&sr<image[0].length&&sc>=0&&sc<image.length&&image[sr][sc]==target)){
            return;
        }
        image[sr][sc] = newColor;
        dfs(image,sr+1,sc,newColor,target);
        dfs(image,sr-1,sc,newColor,target);
        dfs(image,sr,sc+1,newColor,target);
        dfs(image,sr,sc-1,newColor,target);
    }



        public static void main(String[] args) {
        FloodFill f = new FloodFill();
        int[][] numbers = new int[][]{{0,0,0},{0,0,0}};
        int sr = 0;
        int sc = 0;
        int newColor = 2;
        Set<Integer> set = new HashSet<>();
        set.iterator().next();
        f.floodFill(numbers,sr,sc,newColor);
    }
}
