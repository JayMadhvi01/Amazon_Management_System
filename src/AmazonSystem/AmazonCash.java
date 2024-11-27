package AmazonSystem;

public class AmazonCash extends AmazonCredit {
 
private AmazonCash(int id, float amount, PaymentType type) {
	super(id, amount, PaymentType.Cash);
}

public static AmazonCash createCash(String[] str) {
	   AmazonCash amazoncash = null;
	   if(!(AmazonUtil.isValidFloat(str[1]) || AmazonUtil.isValidInt(str[0]))) {
		   return null;
	   }else {
		  int id = Integer.parseInt(str[0]);
		  float amount = Float.parseFloat(str[1]);
		   amazoncash = new AmazonCash(id, amount, PaymentType.Cash);
	   }
	   return amazoncash;
}

}