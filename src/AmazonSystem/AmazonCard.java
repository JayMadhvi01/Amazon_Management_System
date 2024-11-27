package AmazonSystem;

public class AmazonCard extends AmazonCredit{
private String number;
private String expiration;

private AmazonCard(int id, String number, String expiration, float amount, PaymentType type) {
    super(id, amount, PaymentType.Card);
	this.expiration = expiration;
	this.number = number;
}

public static AmazonCard createCard(String[] str) {
	   AmazonCard amazoncard = null;
	   if(!(AmazonUtil.isValidFloat(str[2]) || AmazonUtil.isValidInt(str[0]) || AmazonUtil.isValidFloat(str[2]))) {
		   return null;
	   }else {
		   int id = Integer.parseInt(str[0]);
		   String cardNumber = str[1];
		   String expiration = str[2];
		   float amount = Float.parseFloat(str[2]);
		   amazoncard = new AmazonCard(id, cardNumber, expiration, amount, PaymentType.Card);
	   }
	   return amazoncard;
}

@Override
public String toString() {
	return "AmazonCard [number=" + number + ", expiration=" + expiration + "]";
}

}
