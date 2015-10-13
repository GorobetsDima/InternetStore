package interfaces.daos;

import beans.Payment;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public interface PaymentDAO {
    boolean addNewPayMethod(String payment);

    Payment getPaymentMethodByID(int paymentID);

    boolean update(Payment payment);

}
