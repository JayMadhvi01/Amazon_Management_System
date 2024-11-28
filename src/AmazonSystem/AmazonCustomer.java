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
		wishlist.add(product);
	}

	public void removeProductFromWishList(AmazonProduct product, int id) {
		if(wishlist.isEmpty()) {
			System.err.println("The Wishlist is already empty");
		}else {
			wishlist.remove(product);
		}
	}
	public boolean isProductInWishList(AmazonProduct product, int id) {
		if(wishlist.isEmpty()) {
			System.err.println("The Wishlist is already empty");
			return false;
		}else {
			return wishlist.contains(product);
		}
	}
	public void showWishList() {
		if(wishlist.isEmpty()) {
			System.err.println("WishList for customerID :"+id+"is empty");
		}else {
			System.out.println("WishList for customerID :"+id+":");
			for(AmazonProduct product : wishlist) {
				System.out.println(product);
			}
		}
	}
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
		return "AmazonCustomer [id=" + id + ", name=" + name + ", address=" + address+"]";
	}
}
