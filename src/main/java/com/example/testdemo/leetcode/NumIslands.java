package com.example.testdemo.leetcode;


import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围
 */
public class NumIslands {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0){
            return 0;
        }
        int number = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    number++;
                }
            }
        }
        return number;
    }
    // bfs 算法
    public void bfs(char[][] grad,int i,int j){
        Queue<int[]> record = new LinkedList<>();
        record.add(new int[]{i,j});
        while (!record.isEmpty()){
            int[] cur = record.poll();
            int m = cur[0];
            int n = cur[1];
            //是否越界判断
            if(m>=0&&m<grad.length&&n>=0&&n<grad[0].length&&grad[m][n]=='1'){
                grad[m][n]=0;
                record.add(new int[]{m,n-1});
                record.add(new int[]{m,n+1});
                record.add(new int[]{m-1,n});
                record.add(new int[]{m+1,n});
            }
        }
    }

}
