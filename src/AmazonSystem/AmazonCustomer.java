package AmazonSystem;
import java.util.ArrayList;

import AmazonSystem.AmazonCredit.PaymentType;
public class AmazonCustomer {
	private int id;
	private String name;
	private String address;
	private ArrayList<AmazonComment> comments = new  ArrayList<AmazonComment>();
	private ArrayList<AmazonProduct> wishlist = new ArrayList<AmazonProduct>();
	private ArrayList<AmazonCredit> credits = new ArrayList<AmazonCredit>();

	private AmazonCustomer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public static AmazonCustomer createAmazonCustomer(String[] string) {
		AmazonCustomer customer = null;
		if(!(AmazonUtil.isValidInt(string[0]) || AmazonUtil.isValidString(string[1]))) {
			return null;
		}else {
			int id = Integer.parseInt(string[0]);
			String name = string[1];
			String address = string[2];
			customer = new AmazonCustomer(id, name, address);
		}
		return customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void addCredit(AmazonCredit credit) {
            credits.add(credit);
	}

	public void showCredits(int customerID) {
		   for(AmazonCredit credit : credits) {
			   if(credit.getId() == customerID) {
				   System.out.println(credit);
			   }
		   }
	}
	public void addProductInWishList(AmazonProduct product, int id) {
		AmazonProduct products = null;
		if(products.getId() == id) {
			wishlist.add(products);
		}
	}
	public void removeProductFromWishList(AmazonProduct product) {}
	public boolean isProductInWishList(AmazonProduct product) {}
	public void showWishList() {}
	public void addItemInCart(AmazonCartItem item) {}
	public void removeProductFromCart(AmazonProduct product) {}
	public void showCart() {}
	public void pay(AmazonCredit credit) {}
	public void moveFromCartToComments() {}
	public void hasProductToComment(AmazonProduct product) {}
	public void addComment(AmazonProduct product) {}
	public void setComment(AmazonProduct product, String comment, float rating) {}
	public void showComments(){}

	@Override
	public String toString() {
		return "AmazonCustomer [id=" + id + ", name=" + name + ", address=" + address + ", comments=" + comments
				+ ", wishlist=" + wishlist + ", credits=" + credits + "]";
	}
}
