

package com.codeclan.com.shophomework;

import java.util.ArrayList;

/**
 * Created by user on 26/02/2017.
 */

public class Shop {

    private String shopName;
    private int shopBalance;
    private ArrayList<Integer> sales;
    private ArrayList<Integer> refunds;

    public Shop(String shopName, int shopBalance, ArrayList<Integer> sales, ArrayList<Integer> refunds) {

        this.shopName = shopName;
        this.shopBalance = shopBalance;
        this.sales = sales;
        this.refunds = refunds;
    }

    public String getShopName() {
        return shopName;
    }

    public int getShopBalance() {
        return shopBalance;
    }

    public void shopSellsItems(int items, Customer customer) {

        customer.buyItem(items);
        this.shopBalance += items;
        this.sales.add(items);
    }







}