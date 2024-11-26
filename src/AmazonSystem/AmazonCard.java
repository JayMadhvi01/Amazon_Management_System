package AmazonSystem;

public class AmazonCard extends AmazonCredit{
private String number;
private String expiration;

private AmazonCard(String number, String expiration, float amount, PaymentType type) {
    super(amount, PaymentType.Card);
	this.expiration = expiration;
	this.number = number;
}

public AmazonCard createCard(String[] str) {
	   AmazonCard amazoncard = null;
	   if(!(AmazonUtil.isValidString(str[0]) || AmazonUtil.isValidString(str[1]) || AmazonUtil.isValidFloat(str[2]))) {
		   return null;
	   }else {
		   String accountNumber = str[0];
		   String expiration = str[1];
		   float amount = Float.parseFloat(str[2]);
		   amazoncard = new AmazonCard(accountNumber, expiration, amount, PaymentType.Card);
	   }
	   return amazoncard;
}

@Override
public String toString() {
	return "AmazonCard [number=" + number + ", expiration=" + expiration + "]";
}

}
