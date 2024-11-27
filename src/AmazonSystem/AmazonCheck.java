package AmazonSystem;

public class AmazonCheck extends AmazonCredit{
  private String accountNumber;
  
  private AmazonCheck(int id, String accountNumber, float amount, PaymentType type) {
	  super(id, amount, PaymentType.Check);
	  this.accountNumber = accountNumber;
  }
  
  public static AmazonCheck createCheck(String[] str) {
	   AmazonCheck amazoncheck = null;
	   if(!(AmazonUtil.isValidFloat(str[2]) || AmazonUtil.isValidInt(str[0]) || AmazonUtil.isValidFloat(str[2]))) 
	   {		   return null;
	   }else {
		   int id =Integer.parseInt(str[0]);		   
		   String accountNumber = str[1];
		   float amount = Float.parseFloat(str[2]);
		   amazoncheck = new AmazonCheck(id, accountNumber, amount, PaymentType.Check);
	   }
	   return amazoncheck;
  }

@Override
public String toString() {
	return "AmazonCheck [accountNumber=" + accountNumber + "]";
}
}
