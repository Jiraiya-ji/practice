package com.example.testdemo.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Class_5_practice {
    public static void main(String[] args){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Trader");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        //找出2011年发生的所有交易，并按交易额排序（从低到高)
        List<Transaction> transactionList = transactions.stream()
                .filter(x->x.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .collect(Collectors.toList());

        //交易员都在哪些不同的城市工作过
        List<String> citiesList = transactionList.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        //查找所有来自于剑桥的交易员，并按姓名排序
        List<Trader> traderOfCambridge = transactionList.stream()
                .map(x->x.getTrader())
                .filter(x->x.getName().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(Collectors.toList());

        //返回所有交易员的姓名字符串，按字母顺序排序 归约
        String name = transactionList.stream()
                .map(x->x.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(n1,n2)->n1+n2);

        //有没有交易员是在米兰工作的
        Boolean flag = transactionList.stream()
                .anyMatch(x->x.getTrader().getCity().equals("Milan"));

        //打印生活在剑桥的交易员的所有交易额
        transactionList.stream()
                .filter(x->x.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //所有交易中，最高的交易额是多少
        Optional<Integer> MaxValue = transactionList.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        //找到交易额最小的交易
        Optional<Transaction> transactionOptional = transactionList.stream()
                .reduce((t1,t2)->
                    t1.getValue() < t2.getValue() ? t1 : t2);

    }

}
class Trader{
    private final String name;
    private final String city;
    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }
}
class Transaction{
    private final Trader trader;
    private final int year;
    private final int value;
    public Transaction(Trader trader, int year, int value){
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    public Trader getTrader(){
        return this.trader;
    }
    public int getYear(){
        return this.year;
    }
    public int getValue(){
        return this.value;
    }
    public String toString(){
        return "{" + this.trader + ", " +
                "year: "+this.year+", " +
                "value:" + this.value +"}";
    }
}