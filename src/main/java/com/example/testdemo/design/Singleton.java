package com.example.testdemo.design;

/**
 * 懒汉式单例
 */
class Singleton1 {
    private Singleton1 singleton;
    private Singleton1(){
    }
    public Singleton1 returnSingleton(){
        if(null==singleton){
            singleton = new Singleton1();
        }
        return singleton;
    }
}

/**
 * 饿汉式单例
 */
class Singleton2{
    private final static Singleton2  single= new Singleton2();
    private Singleton2(){}
    //静态工厂方法
    public static Singleton2 getInstance() {
        return single;
    }
}
