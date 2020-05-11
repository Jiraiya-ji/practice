package com.example.testdemo.restAssured;

import io.restassured.RestAssured;

public class RestAssuredTest {
    public static void main(String[] args){
        String response = RestAssured.post().asString();
        System.out.println(response);
    }
}
