package AmazonSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import AmazonSystem.AmazonCredit.PaymentType;

public class AmazonManager {
	Scanner sc = new Scanner(System.in);
	private static final int NUMCOLS = 0;
	private ArrayList<AmazonCustomer> customers = new ArrayList<AmazonCustomer>();
	private ArrayList<AmazonProduct> products = new ArrayList<AmazonProduct>();
	private ArrayList<AmazonCash> credits = new ArrayList<AmazonCash>();
	private ArrayList<AmazonCheck> checks = new ArrayList<AmazonCheck>();	
	private ArrayList<AmazonCard> cards = new ArrayList<AmazonCard>();	


	public void showMenu() {

		System.out.println("===========================================================================");
		System.out.println("||  ****   ****        ****    ****  *****      ALGONQUIN COLLEGE        ||");
		System.out.println("|| **  ** **      **  **  **  **  ** **   **    COURSE: OOP/CST8152      ||");
		System.out.println("|| ****** **      **  **  **  **  ** *****         PROF: PAULO           ||");
		System.out.println("|| **  **  ****        ****    ****  **           TERM: FALL/2024        ||");
		System.out.println("===========================================================================");
		System.out.println("||                   [Menu A2 - Amazon Manager]                          ||"); 
		System.out.println("===========================================================================");
		System.out.println("||                                 || USER                               ||");
		System.out.println("||                                 || Credit Options.....................||");
		System.out.println("|| ADMIN                           ||  [F] Add credit to customer        ||");
		System.out.println("||                                 ||  [G] Show credit from customer     ||");
		System.out.println("|| Product Options.................||  Wishlist options..................||");
		System.out.println("||  [A] Load product list          ||  [H] Add product in wishlist       ||");
		System.out.println("||  [B] Show product list          ||  [I] Remove product from wishlist  ||");
		System.out.println("||  [C] Search Products            ||  [J] Show products from wishlist   ||");
		System.out.println("||                                 ||  Cart Options......................||");
		System.out.println("|| Customer Options................||  [K] Add product in cart           ||");
		System.out.println("||  [D] Add customer               ||  [L] Reomve product from cart      ||");
		System.out.println("||  [E] Show customers             ||  [M] Show products from cart       ||");
		System.out.println("||                                 ||  [N] Buy product from cart         ||");
		System.out.println("||                                 ||  Comment Options...................||");
		System.out.println("||.................................||  [O] Comment products bought       ||");
		System.out.println("||            [Q] Exit             ||  [P] List comments from products   ||");
		System.out.println("===========================================================================");
		System.out.println("Choose an option: ");
	}	




	public void loadProductList() throws AmazonException {
		String line;
		String[] row;
		String csvFile = "Sample-Amazon-Products-v2.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			br.readLine(); 

			while ((line = br.readLine()) != null) {
				row = AmazonUtil.lineReader(line);

				products.add(AmazonProduct.createAmazonProduct(row));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e);
		} catch (IOException e) {
			System.out.println("Input-Output Problem: " + e);
		}

		System.out.println("Product List Created Successfully");
	}

	public void showProductList() {
		for (AmazonProduct product : products) {
			System.out.println(product);
		}
	}
	public void searchInProductList() {
		System.out.print("Enter search term: ");
		String searchTerm = sc.nextLine(); 
		ArrayList<AmazonProduct> res = new ArrayList<>();
		for (AmazonProduct product : products) {
			if (product.toString().toLowerCase().contains(searchTerm.toLowerCase())) {
				res.add(product);  
			}
		}

		if (res.isEmpty()) {
			System.out.println("No products can be found.");
		} else {
			System.out.println("Search Results:");
			for (AmazonProduct product : res) {
				System.out.println(product); 
			}
		}
	}

	public void addCustomer() {
		System.out.print("Enter the Customer ID: ");
		String id = sc.next();
		System.out.print("\nEnter the Customer Name: ");
		String name= sc.next();
		System.out.print("\nEnter the Cusotmer Address: ");	
		String address = sc.next();

		String[] details = {id, name, address};

		customers.add(AmazonCustomer.createAmazonCustomer(details));
		System.out.println("\nCustomer added with success !");
	}

	public void showCustomer() {
		for(AmazonCustomer customer : customers) {
			System.out.println(customer);
		}
	}

	public int findCustomerID(int id) {
		int pos = -1;
		for(AmazonCustomer cus : customers) {
			pos++;
			if(cus.getId() == id) 
				return pos;
		}
		return pos;
	}

	public int findProductID(int id) {
		int pos = -1;
		for(AmazonProduct prod : products) {
			pos++;
			if(prod.getId() == id)
				return pos;
		}
		return pos;
	}

	public void addCreditToCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Customer id: ");
		String id = sc.next();
		int cusID = (int) AmazonUtil.convertStrToFloat(id);
		int pos = findCustomerID(cusID);
		AmazonCustomer customer = customers.get(pos);
		String value;

		System.out.print("\n([1]: Cash, [2]: Check, [3]: Card) : ");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			AmazonCash newCash = null;
			System.out.print("Enter cash value: ");
			value = sc.next();
			String[] cash = {id, value};
			newCash = AmazonCash.createCash(cash);
			customer.addCredit(newCash);
			System.out.println("Credit added with success");
			break;

		case 2:
			AmazonCheck newCheck = null;
			System.out.print("\nEnter the account number: ");
			String ac = sc.next();
			System.out.println("\nEnter the amount: ");
			value = sc.next();
			String[] check = {id, ac, value};
			checks.add(AmazonCheck.createCheck(check));
			customer.addCredit(newCheck);
			System.out.println("Credit added with success");

			break;

		case 3:
			AmazonCard newCard = null;
			System.out.print("Enter the Amount: ");
			value = sc.next();
			System.out.print("Enter the Card number: ");
			String number=sc.next();
			System.out.println("Enter the Expiration Date: ");
			String expiration = sc.next();
			String[] card = {id, number, expiration, value};
			cards.add(AmazonCard.createCard(card));
			customer.addCredit(newCard);
			System.out.println("Credit added with success");
			break;
		}
	}
	public void showCreditFromCustomer() {
		System.out.println("Enter the customer id: ");
		int id = sc.nextInt();
		for(AmazonCustomer customer : customers) {
			customer.showCredits(id);
		}
	}

	public void addProductWishList() {
		System.out.print("Enter the Customer id: ");
		int id = sc.nextInt();
		System.out.print("Enter the product ID to include in the Wishlist : ");
		int prID = sc.nextInt();
	}
	public void removeProductFromWishList() {}
	public void showWishList() {}
	public void addProductInCart() {}
	public void removeProductInCart() {}
	public void showProductsInCart() {}
	public void payCart() {}
	public void addCommentToProduct() {}
	public void showComments() {}
	public void exit() {}

	public static void main(String[] args) throws AmazonException {     
		Scanner sc = new Scanner(System.in);
		AmazonManager manager = new AmazonManager();
		char choice;
		do {
			manager.showMenu();
			choice = sc.next().toUpperCase().charAt(0);
			switch(choice) {
			case 'A':
				manager.loadProductList();
				break;
			case 'B':
				manager.showProductList();
				break;

			case 'C':
				manager.searchInProductList();
				break;

			case 'D':
				manager.addCustomer();
				break;

			case 'E':
				manager.showCustomer();
				break;

			case 'F':
				manager.addCreditToCustomer();
				break;

			case 'G':
				manager.showCreditFromCustomer();
				break;

			case 'H':
				manager.addProductWishList();
				break;

			case 'I':
				manager.removeProductFromWishList();
				break;

			case 'J':
				manager.showWishList();
				break;

			case 'K':
				manager.addProductInCart();
				break;

			case 'L':
				manager.removeProductInCart();
				break;

			case 'M':
				manager.showProductsInCart();
				break;

			case 'N':
				manager.payCart();
				break;

			case 'O':
				manager.addCommentToProduct();
				break;

			case 'P':
				manager.showComments();
				break;
			}
		}while(choice != 'Q');
		sc.close();

		System.out.println("=======================================================================================");
		System.out.println("|| [End of Application (Authors: Gopika Jayarajan 041142228 & Jay Madhvi 041138861)] ||");
		System.out.println("=======================================================================================");






	}
}