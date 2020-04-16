package com.example.testdemo.design;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.FileDescriptor;
import java.lang.reflect.Field;

/**
 *
 */
public class TestReflect {
    public static void main(String[] args) throws NoSuchFieldException {
        Man man = new Man("男");
        WoMan woMan = new WoMan("女");
        getObjectValue(man);
        getObjectValue(woMan);
    }
    public static void getObjectValue(Object o) throws NoSuchFieldException {
        Class<?> clz = o.getClass();
        Field field = clz.getField("sale");
        System.out.println(field);
    }
}

@Data
@AllArgsConstructor
class Man{
  private String sale;
}
@AllArgsConstructor
@Data
class WoMan{
    private String sale;

}