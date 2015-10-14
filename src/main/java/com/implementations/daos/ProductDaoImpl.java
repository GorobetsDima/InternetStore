package com.implementations.daos;

import com.DBConnection;
import com.beans.Product;
import com.interfaces.daos.ProductsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class ProductDaoImpl implements ProductsDAO {

    public boolean addProduct(Product product) {
        return false;
    }

    public Product getProductByID(int productID) {


        Connection conn = DBConnection.getConnection();
        PreparedStatement st = null;
        Product product= null;
        try {
            st = conn.prepareStatement("SELECT * FROM mysqldb.products where ID = ?;");

            st.setInt(1, productID);
            ResultSet rs = st.executeQuery();
            product = new Product();

            if (rs.next()) {


                product.setTitle(rs.getString("TITLE"));
                product.setProductType(rs.getString("PRODUCT_TYPE"));
                product.setPrice(rs.getDouble("PRICE"));
                product.setDiscription(rs.getString("DISCRIPTION"));
                product.setQuantity(rs.getInt("QUANTITY"));
                product.setCategoryID(rs.getInt("CATEGORY_ID"));
                product.setProductID(rs.getInt("ID"));
                System.out.println(product);

            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }



        return product;
    }

    public Product getProductByCategoryID(int categoryID) {
        return null;
    }

    public Product getProductByTitle(String title) {
        return null;
    }

    public Product getProductByPrice(double price) {
        return null;
    }

    public boolean removeProductByID(Product product) {
        return false;
    }

    public boolean updateProduct(Product product) {
        return false;
    }

    public List<Product> getAllProducts() {
        return null;
    }

    public List<Product> getAllProductsByCategory(int categoryID) {
        return null;
    }
}
