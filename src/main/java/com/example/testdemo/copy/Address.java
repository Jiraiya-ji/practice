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
    private String province;//省份
    private String city;//所在城市
}
