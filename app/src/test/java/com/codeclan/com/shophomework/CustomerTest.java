package com.codeclan.com.shophomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by user on 26/02/2017.
 */

public class CustomerTest {

    Customer customer1;
    Customer customer2;

    @Before
    public void before() {
        customer1 = new Customer("Pierre", 300);
        customer2 = new Customer("RayJay", 400);

    }

    @Test
    public void customerHasName() {
        assertEquals("Pierre", customer1.getName());
    }
}