package learning.business.banking;
import java.io.*;

public class Customer implements Serializable{
  // Data Attributes
  private Account  account;
  private String   firstName;
  private String   lastName;
  private String   photo;

  public Customer(String f, String l, String p) {
    firstName = f;
    lastName = l;
    photo = p;
  }

  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public String getPhoto() {
    return photo;
  }
  public Account getAccount() {
    return account;
  }
  public void setAccount(Account acct) {
    account = acct;
  }
}
