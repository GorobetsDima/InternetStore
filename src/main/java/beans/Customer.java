package beans;

/**
 * Created by Dmitriy on 12.10.2015.
 */
public class Customer {
    /*
CREATE TABLE `customers` (
  `FIRSTNAME` varchar(50) NOT NULL,
  `SURNAME` varchar(100) NOT NULL,
  `PHONE` int(20) NOT NULL,
  `ADDRESS` varchar(200) NOT NULL,
  `POSTINDEX` int(11) NOT NULL,
  `LOGIN` varchar(50) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `PURCHASE_ID` int(20) NOT NULL,
  `ID` int(20) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `PHONE_UNIQUE` (`PHONE`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  UNIQUE KEY `FIRSTNAME_UNIQUE` (`FIRSTNAME`),
  UNIQUE KEY `USER_ID_UNIQUE` (`USER_ID`),
  UNIQUE KEY `LOGIN_UNIQUE` (`LOGIN`),
  UNIQUE KEY `PASSWORD_UNIQUE` (`PASSWORD`),
  UNIQUE KEY `EMAIL_UNIQUE` (`EMAIL`),
  UNIQUE KEY `ORDER_ID_UNIQUE` (`PURCHASE_ID`),
  CONSTRAINT `fk_purchase_id` FOREIGN KEY (`PURCHASE_ID`) REFERENCES `purchases` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

     */
    String firstName;
    String surName;
    int phoneNumber;
    String address;
    int postIndex;
    String login;
    String password;
    String email;
    int orderID;
    int customersID;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

       public int getCustomersID() {
        return customersID;
    }

    public void setCustomersID(int customersID) {
        this.customersID = customersID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (phoneNumber != customer.phoneNumber) return false;
        if (postIndex != customer.postIndex) return false;
        if (orderID != customer.orderID) return false;
        if (customersID != customer.customersID) return false;
        if (!firstName.equals(customer.firstName)) return false;
        if (!surName.equals(customer.surName)) return false;
        if (!address.equals(customer.address)) return false;
        if (!login.equals(customer.login)) return false;
        if (!password.equals(customer.password)) return false;
        return email.equals(customer.email);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + surName.hashCode();
        result = 31 * result + phoneNumber;
        result = 31 * result + address.hashCode();
        result = 31 * result + postIndex;
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + orderID;
        result = 31 * result + customersID;
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", postIndex=" + postIndex +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", orderID=" + orderID +
                ", customersID=" + customersID +
                '}';
    }
}
