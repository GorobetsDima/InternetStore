package com.implementations.daos;

import com.beans.Product;
import com.interfaces.daos.ProductsDAO;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Вика on 14.10.2015.
 */
public class ProductDaoImplTest {
    @Test
    public void testGetProductById() throws Exception {
        ProductsDAO pdao = new ProductDaoImpl();
        Product product = pdao.getProductByID(1);
        assertEquals(product.getTitle(), "Apple iphone 6s");
    }
}
