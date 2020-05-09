package com.example.hackcovidapp;

public class OrderFormat {
    public OrderFormat(){

    }

    public OrderFormat(String phonenum,String storeName,String itemsReq,String datetime){
        this.phonenum=phonenum;
        this.storeName=storeName;
        this.itemsReq=itemsReq;
        this.datetime=datetime;
    }

    private String phonenum;
    private String storeName;
    private String itemsReq;
    private String datetime;

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getItemsReq() {
        return itemsReq;
    }

    public void setItemsReq(String itemsReq) {
        this.itemsReq = itemsReq;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
