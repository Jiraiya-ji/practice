package com.example.testdemo.Java8;

public class Class_11_practice {
    public static void main(String[] args) {

    }
}


class Person {
    private Car car;
    public Car getCar() { return car; }
    public String getCarInsurance(Person p ){
        return p.getCar().getInsurance().getName();
    }
}
class Car {
    private Insurance insurance;
    public Insurance getInsurance() { return insurance; }
}
 class Insurance {
    private String name;
    public String getName() { return name; }
}