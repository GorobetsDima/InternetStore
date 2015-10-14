package interfaces.services;

import beans.Customer;

/**
 * Created by Вика on 13.10.2015.
 */
public interface SearcherService {
    void getUserByID();

    void getUserByLogin();

    void getProductByID();

    void getProductByName();

    void getProductsByCategory();

}
