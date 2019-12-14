package com.example.testdemo;

import java.util.Arrays;

public enum LoanOrderStatusInterationEnum {
    //-1主动放弃1尽调中2流水处理中3系统审批中4系统审批拒绝5风控审批中6风控审批拒绝7审批通过

    ZDFQ(-1,"主动放弃","已放弃"),
    JDZ(1,"尽调中","尽调中"),
    LSCL(2,"流水处理中","流水处理"),
    XTSPZ(3,"系统审批中","系统审批"),
    XTSPJJ(4,"系统审批拒绝","审批拒绝"),
    FKSPZ(5,"风控审批中","风控审批"),
    FKSPJJ(6,"风控审批拒绝","审批拒绝"),
    SPTG(7,"审批通过","审批通过"),
    GTFY(8,"沟通复议","沟通复议"), ;
    private int status;

    private String desc;

    private String appShowDesc;

    LoanOrderStatusInterationEnum(int status, String desc, String appShowDesc) {
        this.status = status;
        this.desc = desc;
        this.appShowDesc=appShowDesc;
    }

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    public String getAppShowDesc(){return appShowDesc;}

    public static LoanOrderStatusInterationEnum getEnum(int status){
        return Arrays.asList( LoanOrderStatusInterationEnum.values()).stream().filter(x->x.status==(status)).findFirst().orElse(null);
    }

}
