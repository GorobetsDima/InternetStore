package com.implementations.daos;

import com.beans.Payment;
import com.interfaces.daos.PaymentDAO;

import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class PaymentDaoImpl implements PaymentDAO {
    public boolean addNewPayMethod(String payment) {
        return false;
    }

    public Payment getPaymentMethodByID(int paymentID) {
        return null;
    }

    public boolean update(Payment payment) {
        return false;
    }

    public List<Payment> getAllPayments() {
        return null;
    }
}
