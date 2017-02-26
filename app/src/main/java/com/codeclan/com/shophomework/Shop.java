package com.codeclan.com.shophomework;

import java.util.ArrayList;

/**
 * Created by user on 26/02/2017.
 */

public class Shop {

    private String shopname;
    private int shopBalance;
    private ArrayList<Integer> sales;
    private ArrayList<Integer> refunds;

    public Shop(String shopname, int shopBalance, ArrayList<Integer> sales, ArrayList<Integer> refunds) {

        this.shopname = shopname;
        this.shopBalance = shopBalance;
        this.sales = sales;
        this.refunds = refunds;
    }

}
