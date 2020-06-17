package com.example.testdemo.leetcode;

public class NumIslandsDFS {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0){
            return 0;
        }
        int numberIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1){
                    numberIslands++;
                    //DFS 算法
                    setIslands(grid,i,j);
                }
            }
        }
        return numberIslands;
    }
    public void setIslands(char[][] grid,int i,int j){
        int r = grid.length;
        int c = grid[0].length;
        if (r < 0 || c < 0 || r >= i || c >= j || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        setIslands(grid, r - 1, c);
        setIslands(grid, r + 1, c);
        setIslands(grid, r, c - 1);
        setIslands(grid, r, c + 1);
    }
}
