package com.battcn.enumDemo;

public enum OrdeStatus {
     PAY_SUCCESS(0,"支付成功"),PAY_DOING(0,"支付中"),PAY_FAIL(0,"支付失败");
     OrdeStatus(int value,String desc){
        this.value=value;
        this.desc=desc;
    }
    int value;
    String desc;
    public int getValue(){
        return this.value;
    }

    public String getDesc() {
        return desc;
    }
}
