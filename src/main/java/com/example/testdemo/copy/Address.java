package com.example.testdemo.copy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Address {
    private int route;//街道号
    private String province;//省份
    private String city;//所在城市
}
