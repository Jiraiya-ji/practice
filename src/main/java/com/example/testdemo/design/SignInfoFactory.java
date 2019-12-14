package com.example.testdemo.design;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
@Slf4j
public class SignInfoFactory {
    //池容器
    private static HashMap<ExtrinsicState,SignInfo> pool
            =new HashMap<ExtrinsicState, SignInfo>();

    //报名信息的对象工厂
    @Deprecated
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }
    public static SignInfo getSignInfo(ExtrinsicState key){
        //设置返回对象
        SignInfo result = null;
        //池中没有该对象，则建立，并放入池中
        if(!pool.containsKey(key)) {
            log.info("建立对象，并放入到池中 {}",key);
            result = new SignInfo();
            pool.put(key,result);
        }else {
            result = pool.get(key);
            log.info("直接从池中取出key {}",key);
        }
        return result;
    }
}
