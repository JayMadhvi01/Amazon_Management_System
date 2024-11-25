package AmazonSystem;

public class AmazonCheck extends AmazonCredit{
  private String accountNumber;
  
  private AmazonCheck(String accountNumber, float amount) {
	  super(amount);
	  this.accountNumber = accountNumber;
  }
  
  public AmazonCheck createCheck(String[] check) {
	   return null;  
  }
}
