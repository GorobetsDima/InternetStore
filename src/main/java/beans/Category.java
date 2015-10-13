package beans;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class Category {
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
    String productTitle;
    int categoriesID;

    public Category() {
    }


    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
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

        Category category = (Category) o;

        if (categoriesID != category.categoriesID) return false;
        if (!productType.equals(category.productType)) return false;
        return productTitle.equals(category.productTitle);

    }

    @Override
    public int hashCode() {
        int result = productType.hashCode();
        result = 31 * result + productTitle.hashCode();
        result = 31 * result + categoriesID;
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "productType='" + productType + '\'' +
                ", productTitle='" + productTitle + '\'' +
                ", categoriesID=" + categoriesID +
                '}';
    }
}
