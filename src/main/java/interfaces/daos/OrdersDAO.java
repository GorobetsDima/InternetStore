package interfaces.daos;

import beans.Order;

import java.util.List;

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

    List<Order> getAllOrderByDate(char date);

    List<Order> getAllOrder();

}
