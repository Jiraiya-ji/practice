package com.example.testdemo.copy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person implements Cloneable{
    private String name;
    private int age;
    private Address address;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
