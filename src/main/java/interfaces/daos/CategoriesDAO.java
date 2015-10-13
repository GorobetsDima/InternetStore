package interfaces.daos;

import beans.Category;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public interface CategoriesDAO {
    boolean addNewCategory(Category category);

    Category getCategoryByID(int categoryID);

    boolean updateCategory(Category category);

    boolean removeCategory(Category category);


}
