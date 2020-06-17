package com.example.testdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素
 */
public class MinStack {

    private List<Integer> list;

    /** initialize your data structure here. */
    public MinStack() {
        this.list = new ArrayList<>();
    }

    //入栈
    public void push(int x) {
        list.add(x);
    }
    //出栈
    public void pop() {
        if(list.isEmpty()){
            return;
        }
        list.remove(list.size()-1);
    }
    //返回栈顶
    public int top() {
        if(list.isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    //获取最小
    public int getMin() {
        return list.stream().reduce(Integer::min).get();
    }
}
