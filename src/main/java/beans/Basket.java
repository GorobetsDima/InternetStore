package beans;

/**
 * Created by Вика on 10.10.2015.
 */
public class Basket {
    /*
    CREATE TABLE `basket` (
  `COST` double NOT NULL,
  `PRODUCT_ID` int(20) NOT NULL,
  `QUANTITY` int(20) NOT NULL,
  `ID` int(20) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  KEY `FK_PRODUCT_ID_idx` (`PRODUCT_ID`),
  CONSTRAINT `FK_PRODUCT_ID` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `products` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

     */
    double cost;
    int productID;
    int quantity;
    int basketID;

    public Basket() {
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        if (Double.compare(basket.cost, cost) != 0) return false;
        if (productID != basket.productID) return false;
        if (quantity != basket.quantity) return false;
        return basketID == basket.basketID;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + productID;
        result = 31 * result + quantity;
        result = 31 * result + basketID;
        return result;
    }

    @Override
    public String toString() {
        return "beans.Basket{" +
                "cost=" + cost +
                ", productID=" + productID +
                ", quantity=" + quantity +
                ", basketID=" + basketID +
                '}';
    }
}
