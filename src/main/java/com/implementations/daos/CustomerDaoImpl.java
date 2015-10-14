package com.implementations.daos;

import com.beans.Customer;
import com.beans.Order;
import com.interfaces.daos.CustomersDAO;

import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class CustomerDaoImpl implements CustomersDAO {
    public boolean addCustomer(Customer customer) {
        return false;
    }

    public Customer getCustomerByID(int customerID) {
        return null;
    }

    public Customer getCustomerByEmail(String email) {
        return null;
    }

    public Customer getCustomerByLogin(String login) {
        return null;
    }

    public Order getOrdersOfCustomer(int orderID) {
        return null;
    }

    public boolean removeCustomerByID(int customerID) {
        return false;
    }

    public boolean updateCustomer(Customer customer) {
        return false;
    }

    public List<Customer> getAllCustoners() {
        return null;
    }
}
