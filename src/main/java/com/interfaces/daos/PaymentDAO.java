package com.interfaces.daos;

import com.beans.Payment;

import java.util.List;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public interface PaymentDAO {
    boolean addNewPayMethod(String payment);

    Payment getPaymentMethodByID(int paymentID);

    boolean update(Payment payment);

    List<Payment> getAllPayments();

}
