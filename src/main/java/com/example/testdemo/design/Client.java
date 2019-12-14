package com.example.testdemo.design;

public class Client {
    public static void main(String[] args){
/*        //从工厂中获得一个对象
        //SignInfo signInfo = SignInfoFactory.getSignInfo();
        for(int i=0;i<4;i++){
            String subject = "科目"+i;
            //初始化地址
            for (int j=0;j<30;j++){
                String key = subject+"考试地点"+j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");*/
        ExtrinsicState state1 = new ExtrinsicState();
        state1.setSubject("科目1");
        state1.setLocation("上海");
        SignInfoFactory.getSignInfo(state1);
        ExtrinsicState state2 = new ExtrinsicState();
        state2.setSubject("科目1");
        state2.setLocation("上海");
        long currentTime = System.currentTimeMillis();
        for (int i=0;i<1000000;i++){
            SignInfoFactory.getSignInfo(state2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间："+(endTime-currentTime)+"ms");

    }
}
