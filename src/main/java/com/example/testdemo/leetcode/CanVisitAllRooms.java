package com.example.testdemo.leetcode;

import java.util.*;

/**
 *
 * 有 N 个房间，开始时你位于 0 号房间。每个房间有不同的号码：0，1，2，...，N-1，并且房间里可能有一些钥匙能使你进入下一个房间。
 *
 * 在形式上，对于每个房间 i 都有一个钥匙列表 rooms[i]，每个钥匙 rooms[i][j] 由 [0,1，...，N-1] 中的一个整数表示，其中 N = rooms.length。 钥匙 rooms[i][j] = v 可以打开编号为 v 的房间。
 *
 * 最初，除 0 号房间外的其余所有房间都被锁住。
 *
 * 你可以自由地在房间之间来回走动。
 *
 * 如果能进入每个房间返回 true，否则返回 false
 */
public class CanVisitAllRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //当房间数为 0，1 时
        if(rooms.size()<2){
            return true;
        }
        Set<Integer> roomSet = new HashSet<>();
        roomSet.add(0);
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(rooms.get(0));
        while (!queue.isEmpty()){
            List<Integer> preRoom = queue.poll();
            int size = preRoom.size();
            //空 怎么记录走过该路径上的房间
            for (int i = 0; i < size; i++) {
                int curRoom = preRoom.get(i);
                if(!roomSet.contains(curRoom)){
                    roomSet.add(curRoom);
                    queue.add(rooms.get(curRoom));
                }
            }
        }
        return roomSet.size() == rooms.size();
    }

    public static void main(String[] args) {
        List<Integer> room1 = new ArrayList<>();
        room1.add(1);
        List<Integer> room2 = new ArrayList<>();
        room2.add(2);
        List<Integer> room3 = new ArrayList<>();
        room3.add(3);
        List<Integer> room4 = new ArrayList<>();
        List<List<Integer>> listList = new ArrayList<>();
        listList.add(room1);
        listList.add(room2);
        listList.add(room3);
        listList.add(room4);
        CanVisitAllRooms canVisitAllRooms = new CanVisitAllRooms();
        canVisitAllRooms.canVisitAllRooms(listList);
    }
}
