package com.example.testdemo.Interview;

import java.io.*;
import java.util.*;

public class CountStr {
    public Map<String,Integer> getCountStr(String pathName) throws IOException {
        Map<String,Integer> mapCount = new LinkedHashMap<>();
        BufferedReader bfr = null;
        try{
            File file = new File(pathName);
            bfr = new BufferedReader(new FileReader(file));
            String value = null;
            //存储字符串到 map 里
            while ((value = bfr.readLine())!=null){
                String[] strs = getSplitStr(value);
                for (int i = 0; i < strs.length; i++) {
                   mapCount.put(strs[i],mapCount.getOrDefault(strs[i],0)+1);
                }
            }
            //重新排序
            mapCount= sortByValueAscending(mapCount);
        }catch (FileNotFoundException e){
            System.out.println("文件未找到");
        }catch (IOException e){
            System.out.println("IO 读取错误");
        }
        //清理资源
        finally {
            try{
                if(bfr!=null){
                    bfr.close();
                }
            }catch (IOException e){
                System.out.println("IO 读取错误");

            }
        }
        return mapCount;
    }
    //分割方法，返回一个 List 对象
    public String[] getSplitStr(String s){
        String[] strs = s.split("\\s+");
        return strs;
    }
    //重新排序
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueAscending(Map<K, V> map){
        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>(){
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2)
            {
                int compare = (o1.getValue()).compareTo(o2.getValue());
                return compare;
            }
        });
        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("s");
        list.add("a");
        CountStr countStr = new CountStr();
        System.out.println(countStr.getCountStr("C:\\Users\\MI\\practice\\src\\main\\java\\com\\example\\testdemo\\Interview\\xxx"));
    }
}
