package interfaces.daos;

import beans.Order;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public interface OrdersDAO {
    boolean addOrder(Order order);

    Order getOrderByID(int orderID);
    Order getOrderByProductID(int productID);

    Order getOrderByDate(char date);

    Order getOrderBySellerID(int sellerID);

    Order getOrderByCustomerID(int customerID);

    boolean removeOrder(Order order);

    boolean updateOrder(Order order);

}
