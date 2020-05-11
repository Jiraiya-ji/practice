package com.example.testdemo.Java8;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Class1_1 {
    public static void main(String[] args){
        List<Apple> appleList = new ArrayList<>();
        appleList.sort(comparing(Apple::getWeight));
        Collections.sort(appleList, new Comparator<Apple>() {
//            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
    }
}
@Data
class Apple implements Comparator<Apple>{
    private Integer weight;
    private String color;
    @Override
    public int compare(Apple o1, Apple o2) {
        return 0;
    }
}