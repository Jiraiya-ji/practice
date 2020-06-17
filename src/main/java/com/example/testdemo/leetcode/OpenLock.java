package com.example.testdemo.leetcode;

import java.util.*;

/**
 *
 * 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。每个拨轮可以自由旋转：例如把 '9' 变为  '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。
 *
 * 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。
 *
 * 列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
 *
 * 字符串 target 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。
 */
public class OpenLock {
    public int openLock(String[] deadends, String target) {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("0000");

        Set<String> strings = new HashSet<>();
        //跳过死亡🔒
        for (String str:deadends) {
            strings.add(str);
        }
        int size = 0;
        while (!stringQueue.isEmpty()){
            int length = stringQueue.size();
            for (int i = 0; i < length; i++) {
                String str = stringQueue.poll();
                //是否是目标数
                if(str.equals(target)){
                    return size;
                }
                //添加层级
                List<String> stringList = getNexts(str);
                for(String string:stringList){
                    if(!strings.contains(string)){
                        stringQueue.add(string);
                    }
                }
            }
            size++;
        }
        return -1;
    }
    //每次扭动方法
    // 获得当前值转动一位可以转动到的所有情况
    private List<String> getNexts(String cur){
        List<String> list=new ArrayList<>();
        for(int i=0; i<4; i++){
            StringBuilder curBuilder=new StringBuilder(cur);
            char modChar=cur.charAt(i);
            curBuilder.setCharAt(i,modChar=='0'?'9':(char)(modChar-1));
            list.add(curBuilder.toString());
            curBuilder.setCharAt(i,modChar=='9'?'0':(char)(modChar+1));
            list.add(curBuilder.toString());
        }
        return list;
    }


    public static void main(String[] args){
        String[] strs = {"8887","8889","8878","8898","8788","8988","7888","9888"};
        String target = "8888";
        OpenLock openLock = new OpenLock();
        openLock.openLock(strs,target);

    }
}
