package com.beans;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class Payment {
    /*
    CREATE TABLE `payments` (
  `PAYPAL` varchar(50) NOT NULL,
  `WEBMONEY` varchar(50) NOT NULL,
  `MASTERCARD` varchar(50) NOT NULL,
  `ID` int(20) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `PAYPAL_UNIQUE` (`PAYPAL`),
  UNIQUE KEY `WEBMONEY_UNIQUE` (`WEBMONEY`),
  UNIQUE KEY `MASTERCARD_UNIQUE` (`MASTERCARD`),
  UNIQUE KEY `ID_UNIQUE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

     */
    String payPal;
    String webMoney;
    String masterCard;
    int paymentID;

    public Payment() {
    }

    public String getPayPal() {
        return payPal;
    }

    public void setPayPal(String payPal) {
        this.payPal = payPal;
    }

    public String getWebMoney() {
        return webMoney;
    }

    public void setWebMoney(String webMoney) {
        this.webMoney = webMoney;
    }

    public String getMasterCard() {
        return masterCard;
    }

    public void setMasterCard(String masterCard) {
        this.masterCard = masterCard;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (paymentID != payment.paymentID) return false;
        if (!payPal.equals(payment.payPal)) return false;
        if (!webMoney.equals(payment.webMoney)) return false;
        return masterCard.equals(payment.masterCard);

    }

    @Override
    public int hashCode() {
        int result = payPal.hashCode();
        result = 31 * result + webMoney.hashCode();
        result = 31 * result + masterCard.hashCode();
        result = 31 * result + paymentID;
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payPal='" + payPal + '\'' +
                ", webMoney='" + webMoney + '\'' +
                ", masterCard='" + masterCard + '\'' +
                ", paymentID=" + paymentID +
                '}';
    }
}
