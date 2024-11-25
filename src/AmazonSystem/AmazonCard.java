package AmazonSystem;

public class AmazonCard extends AmazonCredit{
private String number;
private String expiration;

private AmazonCard(String number, String expiration, float amount) {
	super(amount);
	this.expiration = expiration;
	this.number = number;
}

public String toString() {
	return null;
}
}
