package com.example.testdemo.restAssured;


import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.useRelaxedHTTPSValidation;

@Slf4j
class GetInfoRestAssured {
    public static  void main(String[] args) throws Exception {
        KeyStore keyStore = null;
        SSLConfig config = null;
        String password = "}%2R+\\OSsjpP!w%X";
        try {
            keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(
                    new FileInputStream("/Users/jiraiya/Downloads/client.p12"),
                    password.toCharArray());

            log.info("=====================> 加载证书");
        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }

        if (keyStore != null) {

            org.apache.http.conn.ssl.SSLSocketFactory clientAuthFactory = new org.apache.http.conn.ssl.SSLSocketFactory(keyStore, password);

            // set the config in rest assured
            config = new SSLConfig().with().sslSocketFactory(clientAuthFactory).and().allowAllHostnames();

            RestAssured.config = RestAssured.config().sslConfig(config);

        }


//        String URI="http://pre-account.soulapp.cn/v5/account/login";
        String URI="https://api-account.soulapp.cn/v5/account/login";
        useRelaxedHTTPSValidation();
        int port = 443;
        RestAssured.baseURI =URI;
        RestAssured.port = port;

        //请求参数
        Map<String,String> paramsMap = new HashMap<>();
        paramsMap.put("area","86");
        paramsMap.put("password","d6fd6e551699e286e3a4c6c66874f8e9");
        paramsMap.put("phone","12345678905");
        paramsMap.put("platform","platform_ios");

        //请求头
        Header os = new Header("os","ios");
        Header appId = new Header("app-id","10000001");
        Header appVersion = new Header("app-version","3.16.0");
        Header deviceId = new Header("device-id","EE5D24A1-A3F8-4EBB-B5B7-F42EBEE686E9");
        Header apiSign = new Header("api-sign","5Tx*9Yn@8Mr$9Ou^4Bx^5Sf&7Ug*1Dw");
        Header apiSignVersion = new Header("api-sign-version","v5");
        Header userAgent = new Header("User-Agent","TlUyYjJJbzdzZlgwaTdZYktUOVE5RTltb2xydndOYitsR3NGVmU5UUVqV2Q0S0lpV0l1azQ5MFFpekRZanBTR25LeE02MjdIeGdLM3VVeHJ6TktyaXFveDBMRStpNWppaXY1L3dkeUVEaTczam5FSEdKcUlpQT09");
        Header appTime = new Header("app-time","1589514583124");
        List<Header> headerList = new ArrayList<>();

        headerList.add(os);
        headerList.add(appId);
        headerList.add(appVersion);
        headerList.add(deviceId);
        headerList.add(apiSign);
        headerList.add(apiSignVersion);
        headerList.add(userAgent);
        headerList.add(appTime);

        Headers headers = new Headers(headerList);
        RestAssured.useRelaxedHTTPSValidation();
//        RestAssured.config().getSSLConfig().with().keyStore("/Users/jiraiya/Downloads/client.p12", password);


        String response = given().log().all()
                .headers(headers)
                .params(paramsMap)
                .when()
                .post()
                .asString();
        System.out.println("返回的 response ：==============>"+response);
    }
}
