package com.example.testdemo.copy;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person("张三",20,new Address("安徽","合肥"));

        Person clonePerson=(Person) person.clone();

        System.out.println(person);
        System.out.println(clonePerson);

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());

        clonePerson.setName("李四");
        clonePerson.setAge(22);
        Address address=clonePerson.getAddress();
        address.setProvince("江苏");

        System.out.println(person.toString());
        System.out.println(clonePerson.toString());
    }
}
