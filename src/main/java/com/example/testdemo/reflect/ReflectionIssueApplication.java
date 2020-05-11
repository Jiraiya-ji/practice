package com.example.testdemo.reflect;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReflectionIssueApplication {
    private void age(int age) {

        log.info("int age = {}", age);
    }

    private void age(Integer age) {
        log.info("Integer age = {}", age);
    }
    public static void main(String[] args){
        ReflectionIssueApplication reflectionIssueApplication = new ReflectionIssueApplication();
        reflectionIssueApplication.age(36);
//        reflectionIssueApplication.getClass().getDeclaredMethod("age", Integer.TYPE).invoke(this, Integer.valueOf("36"));
        reflectionIssueApplication.age(Integer.valueOf(36));
    }
}
