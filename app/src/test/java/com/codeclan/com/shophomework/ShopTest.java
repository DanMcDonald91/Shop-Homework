package com.codeclan.com.shophomework;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 26/02/2017.
 */

public class ShopTest {

    Shop shop1;
    Shop shop2;

    Customer customer1;
    Customer customer2;

    private ArrayList<Integer> sales;
    private ArrayList<Integer> refunds;

    @Before
    public void before() {

        shop1 = new Shop("Fat Dans", 1000, sales, refunds);
        shop2 = new Shop("Jam Land", 2000, sales, refunds);

        customer1 = new Customer("Pierre", 300);
        customer2 = new Customer("RayJay", 400);

        sales = new ArrayList<Integer>();
        sales.add(50);
        sales.add(150);
        sales.add(300);

        refunds = new ArrayList<Integer>();
        refunds.add(10);
        refunds.add(50);
        refunds.add(100);



    }

    @Test
    public void shopHasName() {

        assertEquals("Fat Dans", shop1.getShopName());
    }

    @Test
    public void shopHasBalance() {
        assertEquals(2000, shop2.getShopBalance());
    }

    @Test
    public void shopSellsItems() {
        shop1.s
    }

}
