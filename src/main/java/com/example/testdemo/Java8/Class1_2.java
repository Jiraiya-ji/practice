package com.example.testdemo.Java8;

import java.util.ArrayList;
import java.util.List;

public class Class1_2<T> {
    public static void main(String[] args){
        List<Apple> appleList = new ArrayList<>();
    }
    public static List<Apple> fiflterGreenApple(List<Apple> inventory,Color color){
        List<Apple> appleList = new ArrayList<>();
        for (Apple apple:inventory){
            if(color.equals(apple.getColor())){
                appleList.add(apple);
            }
        }
        return appleList;
    }
    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    interface Predicate<T>{
        boolean test(T t);
    }
    public static <T> List<T> filter(List<T> filter,Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T e: result){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}
enum Color { RED, GREEN }

interface ApplePredicate{
    boolean test(Apple apple);
}
class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>150;
    }
}
class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}

interface AppleFormatter{
    String accept(Apple a);
}

class AppleFancyFormatter implements AppleFormatter{

    @Override
    public String accept(Apple a) {
        String characteristic = a.getWeight()>150 ? "Light":"Weight";
        return a.toString()+characteristic;
    }
}

