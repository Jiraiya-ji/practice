package com.example.testdemo.copy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private Address address;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
