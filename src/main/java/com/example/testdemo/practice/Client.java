package com.example.testdemo.practice;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Server m = new SimpleServer(1000);
//        System.out.println(m.getPort());
        Client client = new Client(){};
        List<String> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<String> c = new ArrayList<String>(){};
        List<String> d = new ArrayList<String>(){{add("1");}};
        d.add("1");
        System.out.println(a.getClass()==b.getClass());
        System.out.println(a.getClass()==c.getClass());
        System.out.println(a.getClass()==d.getClass());

    }
}
abstract class Server{
    public final static int DEFAULT_PORT = 40000;
    public Server(){
        int port = getPort();
        System.out.println(port);
    }
    public abstract int getPort();
}
class SimpleServer extends Server{
    private int port = 100;

    public SimpleServer(int _port){
        System.out.println(port);
        port = _port;
    }
    public SimpleServer(){
        port = 3333;
    }
    @Override
    public int getPort() {
        return this.port ;
//        return DEFAULT_PORT;
    }
}