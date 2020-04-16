package com.example.testdemo.leetcode;
import java.util.LinkedList;

public class MyHashSet {
    private Bucket[] buckets;
    private int range = 199;
    public MyHashSet() {
        buckets = new Bucket[range+1];
        for (int i = 0; i <= range; i++) {
            buckets[i] = new Bucket();
        }
    }
    protected int getRange(int key){
        return key%range;
    }

    public void add(int key) {
        buckets[getRange(key)].insert(key);
    }

    public void remove(int key) {
        buckets[getRange(key)].delete(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return buckets[getRange(key)].exists(key);
    }
}

class Bucket {
    private LinkedList<Integer> container;

    public Bucket() {
        container = new LinkedList<Integer>();
    }

    public void insert(Integer key) {
        int index = this.container.indexOf(key);
        if (index == -1) {
            this.container.addFirst(key);
        }
    }

    public void delete(Integer key) {
        this.container.remove(key);
    }

    public boolean exists(Integer key) {
        int index = this.container.indexOf(key);
        return (index != -1);
    }
}

