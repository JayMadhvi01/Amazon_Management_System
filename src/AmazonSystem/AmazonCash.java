package AmazonSystem;

public class AmazonCash extends AmazonCredit {
 
private AmazonCash(float amount, PaymentType type) {
	super(amount, PaymentType.Cash);
}

public AmazonCash createCash(String[] str) {
	   AmazonCash amazoncash = null;
	   if(!(AmazonUtil.isValidFloat(str[0]))) {
		   return null;
	   }else {
		  float amount = Float.parseFloat(str[0]);
		   amazoncash = new AmazonCash(amount, PaymentType.Cash);
	   }
	   return amazoncash;
}
}