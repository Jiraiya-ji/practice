package com.example.testdemo.design;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignInfo {
    //报名人员的ID
    private String id;
    //考试地点
    private String location;
    //考试科目
    private String subject;
    //邮寄地址
    private String postAddress;
}
