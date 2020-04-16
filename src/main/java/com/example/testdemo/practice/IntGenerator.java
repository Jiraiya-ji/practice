package com.example.testdemo.practice;

public abstract class IntGenerator {
    private volatile boolean canceld = false;
    public abstract int next();
    public void cancel(){
        canceld = true;
    }
    public boolean isCanceld(){
        return canceld;
    }
}
