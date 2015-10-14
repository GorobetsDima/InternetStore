package com.implementations.daos;

import com.beans.Seller;
import com.interfaces.daos.SellersDAO;

import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class SellerDaoImpl implements SellersDAO {

    public boolean addSeller(Seller seller) {
        return false;
    }

    public Seller getSellerByID(int customerID) {
        return null;
    }

    public Seller getSellerByEmail(String email) {
        return null;
    }

    public Seller getSellerByLogin(String login) {
        return null;
    }

    public boolean removeSellerByID(int sellerID) {
        return false;
    }

    public boolean updateSeller(Seller seller) {
        return false;
    }

    public List<Seller> getAllSellers() {
        return null;
    }
}
