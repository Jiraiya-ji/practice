package com.example.testdemo.practice;

interface A{}
interface B{}
interface C{}

class Toy{
    Toy(){}
    Toy(int i){}
}
class FancyToy extends  Toy implements A,B,C{
    FancyToy(){
        super(1);
    }
}
public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Class name:"+cc.getName());
        System.out.println("interface:"+cc.isInterface());
        System.out.println("Simple name:"+cc.getSimpleName());
        System.out.println("Canonical name:"+cc.getCanonicalName());
    }
    public static void main(String[] args){
        Class c= null;
        try{
            c =Class.forName("typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        printInfo(c);
    }
}
