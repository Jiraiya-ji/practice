package com.example.testdemo.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 * 思考问题，如何去归纳问题，移位操作
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i <9 ; i++) {
            HashMap<Integer,Character> row = new HashMap<>();
            HashMap<Integer,Character> column = new HashMap<>();
            HashMap<Integer,Character> boards = new HashMap<>();
            for (int j = 0; j < 9; j++) {
                row.put(j,board[i][j]);
                column.put(j,board[j][i]);
                boards.put(j,board[3 * (i / 3) + j / 3][3 * (i % 3) + j % 3]);
            }
            if(!isValid(row)){
                return false;
            }
            if(!isValid(column)){
                return false;
            }
            if(!isValid(boards)){
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(HashMap<Integer,Character> hashMap){
        HashMap<Character,Integer> hashMap1 = new HashMap<>();
        for(Integer e:hashMap.keySet()){
            if(hashMap.get(e)!='.'){
                hashMap1.put(hashMap.get(e),hashMap1.getOrDefault(hashMap.get(e),0)+1);
            }
        }
        Iterator<Map.Entry<Character,Integer>> iterator = hashMap1.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character,Integer> entry = iterator.next();
            if(entry.getValue()>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        HashMap<Integer,Character> hashMap = new HashMap<>();
        hashMap.put(0,'8');
        hashMap.put(1,'6');
        hashMap.put(2,'.');
        hashMap.put(3,'8');
        System.out.println(isValid(hashMap));
    }
}
