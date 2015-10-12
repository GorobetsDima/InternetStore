package beans;

/**
 * Created by Вика on 10.10.2015.
 */
public class Categories {
    /*
    CREATE TABLE `categoies` (
  `PRODUCT_TYPE` varchar(100) NOT NULL,
  `ID` int(20) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `PRODUCT_TYPE_UNIQUE` (`PRODUCT_TYPE`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

     */
    String productType;
    int categoriesID;

    public Categories() {
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getCategoriesID() {
        return categoriesID;
    }

    public void setCategoriesID(int categoriesID) {
        this.categoriesID = categoriesID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categories that = (Categories) o;

        if (categoriesID != that.categoriesID) return false;
        return productType.equals(that.productType);

    }

    @Override
    public int hashCode() {
        int result = productType.hashCode();
        result = 31 * result + categoriesID;
        return result;
    }

    @Override
    public String toString() {
        return "beans.Categories{" +
                "productType='" + productType + '\'' +
                ", categoriesID=" + categoriesID +
                '}';
    }
}