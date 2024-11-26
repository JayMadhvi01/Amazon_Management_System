package AmazonSystem;

public class AmazonCheck extends AmazonCredit{
  private String accountNumber;
  
  private AmazonCheck(String accountNumber, float amount, PaymentType type) {
	  super(amount, PaymentType.Check);
	  this.accountNumber = accountNumber;
  }
  
  public AmazonCheck createCheck(String[] str) {
	   AmazonCheck amazoncheck = null;
	   if(!(AmazonUtil.isValidString(str[0]) || AmazonUtil.isValidFloat(str[1]))) {
		   return null;
	   }else {
		   String accountNumber = str[0];
		   float amount = Float.parseFloat(str[1]);
		   amazoncheck = new AmazonCheck(accountNumber, amount, PaymentType.Check);
	   }
	   return amazoncheck;
  }

@Override
public String toString() {
	return "AmazonCheck [accountNumber=" + accountNumber + "]";
}
}
