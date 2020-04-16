package com.example.testdemo.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class AdapterMethodIdiom {
    public static void main(String[] args){
        String[] strs = {"1","2","3"};
        ReversibleArrayList<String> reversibleArrayList = new ReversibleArrayList<>(Arrays.asList(strs));
        for (String e:reversibleArrayList){
            System.out.println(e);
        }
        for(String e:reversibleArrayList.reversed()){
            System.out.println(e);
        }
    }
}
class ReversibleArrayList<T> extends ArrayList<T>{
    public ReversibleArrayList(Collection<T> c){
        super(c);
    }
    public Iterable<T> reversed(){
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>(){
                    int current = size() -1;
                    public boolean hasNext(){return current > -1;}
                    public T next(){return get(current--);}
                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}