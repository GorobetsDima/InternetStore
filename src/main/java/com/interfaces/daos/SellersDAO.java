package com.interfaces.daos;

import com.beans.Seller;

import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public interface SellersDAO {
    boolean addSeller(Seller seller);

    Seller getSellerByID(int customerID);

    Seller getSellerByEmail(String email);

    Seller getSellerByLogin(String login);

    boolean removeSellerByID(int sellerID);

    boolean updateSeller(Seller seller);
    List<Seller> getAllSellers();
}
