package com.example.testdemo.design;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class SignInfo4Pool extends SignInfo {
    //定义一个对象池提取的KEY值
    private String key;
}
