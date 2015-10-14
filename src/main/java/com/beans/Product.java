package com.beans;
/**
 * Created by Dmitriy on 12.10.2015.
 */
public class Product {

    int categoryID;
    String title;
    String productType;
    double price;
    String discription;
    int quantity;
    int productID;

    public Product() {
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (categoryID != product.categoryID) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (quantity != product.quantity) return false;
        if (productID != product.productID) return false;
        if (!title.equals(product.title)) return false;
        if (!productType.equals(product.productType)) return false;
        return discription.equals(product.discription);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = categoryID;
        result = 31 * result + title.hashCode();
        result = 31 * result + productType.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + discription.hashCode();
        result = 31 * result + quantity;
        result = 31 * result + productID;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "categoryID=" + categoryID +
                ", title='" + title + '\'' +
                ", productType='" + productType + '\'' +
                ", price=" + price +
                ", discription='" + discription + '\'' +
                ", quantity=" + quantity +
                ", productID=" + productID +
                '}';
    }
}
