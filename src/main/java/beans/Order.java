package beans;

/**
 * Created by Вика on 10.10.2015.
 */
public class Order {
    /*
CREATE TABLE `orders` (
  `DATE` datetime NOT NULL,
  `CUSTOMER_ID` int(20) NOT NULL,
  `SELLER_ID` int(20) NOT NULL,
  `QUANTITY` int(20) NOT NULL,
  `BASKET_ID` int(20) NOT NULL,
  `PRODUCT_PRICE` double NOT NULL,
  `COST` double NOT NULL,
  `STATUS` varchar(45) NOT NULL,
  `ID` int(20) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `CUSTOMER_ID_UNIQUE` (`CUSTOMER_ID`),
  UNIQUE KEY `SELLER_ID_UNIQUE` (`SELLER_ID`),
  UNIQUE KEY `ORDERS_ID_UNIQUE` (`ID`),
  UNIQUE KEY `BASKET_ID_UNIQUE` (`BASKET_ID`),
  CONSTRAINT `fk_basket_id` FOREIGN KEY (`BASKET_ID`) REFERENCES `basket` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_customer_id` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `customers` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_seller_id` FOREIGN KEY (`SELLER_ID`) REFERENCES `sellers` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

     */
    char date;
    int customerID;
    int sellerID;
    int quantity;
    int basketID;
    double productPrice;
    double cost;
    String status;
    int paymentID;
    int orderID;

    public Order() {
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public char getDate() {
        return date;
    }

    public void setDate(char date) {
        this.date = date;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBasketID() {
        return basketID;
    }

    public void setBasketID(int basketID) {
        this.basketID = basketID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (date != order.date) return false;
        if (customerID != order.customerID) return false;
        if (sellerID != order.sellerID) return false;
        if (quantity != order.quantity) return false;
        if (basketID != order.basketID) return false;
        if (Double.compare(order.productPrice, productPrice) != 0) return false;
        if (Double.compare(order.cost, cost) != 0) return false;
        if (paymentID != order.paymentID) return false;
        if (orderID != order.orderID) return false;
        return status.equals(order.status);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) date;
        result = 31 * result + customerID;
        result = 31 * result + sellerID;
        result = 31 * result + quantity;
        result = 31 * result + basketID;
        temp = Double.doubleToLongBits(productPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + status.hashCode();
        result = 31 * result + paymentID;
        result = 31 * result + orderID;
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", customerID=" + customerID +
                ", sellerID=" + sellerID +
                ", quantity=" + quantity +
                ", basketID=" + basketID +
                ", productPrice=" + productPrice +
                ", cost=" + cost +
                ", status='" + status + '\'' +
                ", paymentID=" + paymentID +
                ", orderID=" + orderID +
                '}';
    }
}
