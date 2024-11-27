package AmazonSystem;

public abstract class AmazonCredit {
	enum PaymentType{
		Cash, Check, Card;
	}
    private int id;
	private float amount;
	private PaymentType type;

	AmazonCredit(int id, float amount, PaymentType type){
		this.setId(id);
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
		return "AmazonCredit [id=" + id + ", amount=" + amount + ", type=" + type + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
