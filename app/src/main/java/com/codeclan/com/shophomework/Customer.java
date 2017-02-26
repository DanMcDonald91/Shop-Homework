package com.codeclan.com.shophomework;

/**
 * Created by user on 26/02/2017.
 */

public class Customer {

    private String name;
    private int cash;

    public Customer(String name, int cash) {

        this.setName(name);
        this.setCash(cash);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void buyItem(int purchase){
        this.cash -= purchase;

    }

    public void getRefund(int refund) {
        this.cash += refund;
    }
}
