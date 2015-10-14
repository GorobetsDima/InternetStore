package com.implementations.daos;

import com.beans.Order;
import com.interfaces.daos.OrdersDAO;

import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class OrderDaoImpl implements OrdersDAO {
    public boolean addOrder(Order order) {
        return false;
    }

    public Order getOrderByID(int orderID) {
        return null;
    }

    public Order getOrderByProductID(int productID) {
        return null;
    }

    public Order getOrderByDate(char date) {
        return null;
    }

    public Order getOrderBySellerID(int sellerID) {
        return null;
    }

    public Order getOrderByCustomerID(int customerID) {
        return null;
    }

    public boolean removeOrder(Order order) {
        return false;
    }

    public boolean updateOrder(Order order) {
        return false;
    }

    public List<Order> getAllOrderByDate(char date) {
        return null;
    }

    public List<Order> getAllOrder() {
        return null;
    }
}
