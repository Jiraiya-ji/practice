package com.example.testdemo.leetcode;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
 * 两个相邻元素间的距离为 1 。
 */
public class UpdateMatrix {
    public int[][] updateMatrix(int[][] matrix) {

        Integer m = matrix.length;
        Integer n = matrix[0].length;
        Boolean[][] visted = new Boolean[m][n];
        int[][] result = new int[m][n];
        Queue<Integer[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                visted[i][j] = false;
                if(matrix[i][j]==0){
                    visted[i][j] = true;
                    result[i][j] = 0;
                    queue.add(new Integer[]{i,j});
                }
            }
        }
        //bfs
        Integer[][] direction = {{0,-1},{0,1},{-1,0},{1,0}};
        while (!queue.isEmpty()){
            Integer[] out = queue.poll();
            Integer innerm = out[0];
            Integer innern = out[1];
            for (int i = 0; i < 4; i++) {
                int cloumn = direction[i][0]+innerm;
                int row = direction[i][1]+innern;
                if(cloumn>=0&&cloumn<m&&row>=0&&row<n&&!visted[cloumn][row]){
                    visted[cloumn][row] =true;
                    result[cloumn][row] = result[innerm][innern]+1;
                    queue.add(new Integer[]{cloumn,row});
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] numbers = {{1,1,1},{1,0,1}};
        UpdateMatrix updateMatrix = new UpdateMatrix();
        updateMatrix.updateMatrix(numbers);
    }
}
