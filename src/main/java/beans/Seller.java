package beans;

/**
 * Created by Вика on 10.10.2015.
 */
public class Seller {
    /*
CREATE TABLE `sellers` (
  `FIRSTNAME` varchar(50) NOT NULL,
  `SURNAME` varchar(100) NOT NULL,
  `PHONE` int(20) NOT NULL,
  `LOGIN` varchar(50) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `ID` int(20) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  UNIQUE KEY `USER_ID_UNIQUE` (`USER_ID`),
  UNIQUE KEY `LOGIN_UNIQUE` (`LOGIN`),
  UNIQUE KEY `PASSWORD_UNIQUE` (`PASSWORD`),
  UNIQUE KEY `EMAIL_UNIQUE` (`EMAIL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

     */
    String firstName;
    String surName;
    int phoneNumber;
    String login;
    String password;
    String email;
    int sellersID;

    public Seller() {
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

    public int getSellersID() {
        return sellersID;
    }

    public void setSellersID(int sellersID) {
        this.sellersID = sellersID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;

        if (phoneNumber != seller.phoneNumber) return false;
        if (sellersID != seller.sellersID) return false;
        if (!firstName.equals(seller.firstName)) return false;
        if (!surName.equals(seller.surName)) return false;
        if (!login.equals(seller.login)) return false;
        if (!password.equals(seller.password)) return false;
        return email.equals(seller.email);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + surName.hashCode();
        result = 31 * result + phoneNumber;
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + sellersID;
        return result;
    }

    @Override
    public String toString() {
        return "beans.Seller{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", sellersID=" + sellersID +
                '}';
    }
}
