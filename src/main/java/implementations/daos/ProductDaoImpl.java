package implementations.daos;

import beans.Product;
import interfaces.daos.ProductsDAO;

import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class ProductDaoImpl implements ProductsDAO {
    public boolean addProduct(Product product) {
        return false;
    }

    public Product getProductByID(int productID) {
        return null;
    }

    public Product getProductByCategoryID(int categoryID) {
        return null;
    }

    public Product getProductByTitle(String title) {
        return null;
    }

    public Product getProductByPrice(double price) {
        return null;
    }

    public boolean removeProductByID(Product product) {
        return false;
    }

    public boolean updateProduct(Product product) {
        return false;
    }

    public List<Product> getAllProducts() {
        return null;
    }

    public List<Product> getAllProductsByCategory(int categoryID) {
        return null;
    }
}
