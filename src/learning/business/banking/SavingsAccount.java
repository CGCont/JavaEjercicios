package learning.business.banking;
import java.io.*;

public class SavingsAccount extends Account implements Serializable{

  private double   interestRate;

  public SavingsAccount(double bal, double rate) {
    super(bal);
    interestRate = rate;
  }
}
