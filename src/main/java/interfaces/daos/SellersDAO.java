package interfaces.daos;

import beans.Seller;

/**
 * Created by Вика on 12.10.2015.
 */
public interface SellersDAO {
    boolean addSeller(Seller seller);

    Seller getSellerByID(int customerID);

    Seller getSellerByEmail(String email);

    Seller getSellerByLogin(String login);

    boolean updateSeller(Seller seller);
}
