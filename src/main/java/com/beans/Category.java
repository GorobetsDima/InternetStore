package com.beans;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class Category {

    String productType;
    String categoryName;
    int categoriesID;

    public Category() {
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
        return categoryName.equals(category.categoryName);

    }

    @Override
    public int hashCode() {
        int result = productType.hashCode();
        result = 31 * result + categoryName.hashCode();
        result = 31 * result + categoriesID;
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "productType='" + productType + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoriesID=" + categoriesID +
                '}';
    }
}
