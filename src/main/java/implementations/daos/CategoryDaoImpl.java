package implementations.daos;

import beans.Category;
import interfaces.daos.CategoriesDAO;

import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class CategoryDaoImpl implements CategoriesDAO {
    public boolean addNewCategory(Category category) {
        return false;
    }

    public Category getCategoryByID(int categoryID) {
        return null;
    }

    public boolean updateCategory(Category category) {
        return false;
    }

    public boolean removeCategory(Category category) {
        return false;
    }

    public List<Category> getAllCategory() {
        return null;
    }
}
