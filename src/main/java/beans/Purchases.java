package beans;

/**
 * Created by Вика on 10.10.2015.
 */
public class Purchases {
    /*
CREATE TABLE `purchases` (
  `STATUS` varchar(20) NOT NULL,
  `ORDER_ID` int(20) NOT NULL,
  `PAYMENT_ID` int(20) NOT NULL,
  `ID` int(20) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `BASKET_ID_UNIQUE` (`ORDER_ID`),
  UNIQUE KEY `PAYMENT_ID_UNIQUE` (`PAYMENT_ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  CONSTRAINT `fk_order_id` FOREIGN KEY (`ORDER_ID`) REFERENCES `orders` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_payment_id` FOREIGN KEY (`PAYMENT_ID`) REFERENCES `payments` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

     */
   String status;
    int orderID;
    int paymentID;
    int purchaseID;

    public Purchases() {
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

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchases purchases = (Purchases) o;

        if (orderID != purchases.orderID) return false;
        if (paymentID != purchases.paymentID) return false;
        if (purchaseID != purchases.purchaseID) return false;
        return status.equals(purchases.status);

    }

    @Override
    public int hashCode() {
        int result = status.hashCode();
        result = 31 * result + orderID;
        result = 31 * result + paymentID;
        result = 31 * result + purchaseID;
        return result;
    }

    @Override
    public String toString() {
        return "Purchases{" +
                "status='" + status + '\'' +
                ", orderID=" + orderID +
                ", paymentID=" + paymentID +
                ", purchaseID=" + purchaseID +
                '}';
    }
}
