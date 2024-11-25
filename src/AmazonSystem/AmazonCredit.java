package AmazonSystem;

public class AmazonCredit {
 enum PaymentType{
	 Cash, Check, Card;
 }
 
 private float amount;
 private PaymentType type;
 
 AmazonCredit(float amount){
	 this.amount = amount;
 }
 
 public String toString() {
	 return null;
 }
}
