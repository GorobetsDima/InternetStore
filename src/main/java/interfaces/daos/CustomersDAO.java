package interfaces.daos;

import beans.Customer;
import beans.Order;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public interface CustomersDAO {
    boolean addCustomer(Customer customer);

    Customer getCustomerByID(int customerID);

    Customer getCustomerByEmail(String email);

    Customer getCustomerByLogin(String login);

    Order getOrdersOfCustomer(int orderID);

    boolean removeCustomerByID(int customerID);

    boolean updateCustomer(Customer customer);
}
