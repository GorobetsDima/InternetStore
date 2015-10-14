package com;

import com.implementations.daos.ProductDaoImpl;

/**
 * Created by Вика on 14.10.2015.
 */
public class Runner {
    public static void main(String[] args) {
        ProductDaoImpl pdi = new ProductDaoImpl();
        pdi.getProductByID(1);
    }
}
