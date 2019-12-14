package com.example.testdemo.design;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultiThread extends Thread {
    private SignInfo signInfo;
    public MultiThread(SignInfo signInfo){
        this.signInfo = signInfo;
    }
    public void run(){
        if(!signInfo.getId().equals(signInfo.getLocation())){
            log.info("奇怪 {}",signInfo.getId().equals(signInfo.getLocation()));
            log.info("编号：{},考试地址; {},SignInfo {}",signInfo.getId(),signInfo.getLocation(),signInfo.toString());
            log.info("编号：{},考试地址; {},SignInfo {}",signInfo.getId(),signInfo.getLocation(),signInfo.toString());
//            System.out.println("");
            log.info("线程不安全了");
        }
    }
}
