package AmazonSystem;

public abstract class AmazonCredit {
	enum PaymentType{
		Cash, Check, Card;
	}

	private float amount;
	private PaymentType type;

	AmazonCredit(float amount, PaymentType type){
		this.setAmount(amount);
		this.setType(type);
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public PaymentType getType() {
		return type;
	}

	public void setType(PaymentType type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "AmazonCredit [amount=" + amount + ", type=" + type + "]";
	}

}
