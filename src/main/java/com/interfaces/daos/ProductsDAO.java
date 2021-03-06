package com.interfaces.daos;

import com.beans.Product;

import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public interface ProductsDAO {
    boolean addProduct(Product product);

    Product getProductByID(int productID);

    Product getProductByCategoryID(int categoryID);

    Product getProductByTitle(String title);

    Product getProductByPrice(double price);

    boolean removeProductByID(Product product);

    boolean updateProduct(Product product);

    List<Product> getAllProducts();

    List<Product> getAllProductsByCategory(int categoryID);


}
