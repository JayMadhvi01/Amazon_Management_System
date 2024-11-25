package AmazonSystem;
import java.util.Scanner;

public class AmazonProduct {
	Scanner input = new Scanner(System.in);

	private int id;
	private String name;
	private AmazonProductCategory category;
	private AmazonProductSubCategory subCategory;
	private String imageURL;
	private String link;
	private float rating;
	private int nRatings;
	private float discountPrice;
	private float actualPrice;

	private AmazonProduct(int id, String name, AmazonProductCategory category, AmazonProductSubCategory subCategory,
			String imageURL, String link, float rating, int nRatings, float discountPrice, float actualPrice) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.subCategory = subCategory;
		this.imageURL = imageURL;
		this.link = link;
		this.rating = rating;
		this.nRatings = nRatings;
		this.discountPrice = discountPrice;
		this.actualPrice = actualPrice;
	}

	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public float getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(float discountPrice) {
		this.discountPrice = discountPrice;
	}

	public float getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(float actualPrice) {
		this.actualPrice = actualPrice;
	}

	public AmazonProductSubCategory getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(AmazonProductSubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public AmazonProductCategory getCategory() {
		return category;
	}
	public void setCategory(AmazonProductCategory category) {
		this.category = category;
	}

	public int getnRatings() {
		return nRatings;
	}
	public void setnRatings(int nRatings) {
		this.nRatings = nRatings;
	}
	
	public AmazonProduct createAmazonProduct(String[] products) {
		AmazonProduct product = null;
		for(int i=0; i < products.length; i++) {
			if(products[i] == null || products[i].isEmpty() || products[i].isBlank()) {
				return null;
			}else {
				int id = Integer.parseInt(products[0]);
				String name = products[1];
				AmazonProductCategory category =  new AmazonProductCategory(products[2]);
				AmazonProductSubCategory subCategory = new AmazonProductSubCategory(products[3], category);
				String imageURL = products[4];
				String link = products[5];
				float rating = Float.parseFloat(products[6]);
				int nRating = Integer.parseInt(products[7]);
				float discountPrice = Float.parseFloat(products[8]);
				float actualPrice = Float.parseFloat(products[9]);
				product = new AmazonProduct(id, name, category, subCategory, imageURL, link, rating, nRating, discountPrice, actualPrice);
			}
		}
		return product;
	}
	
	
	public String toString() {
        return "[" + id + ", " + name + ", " + category + ", " + subCategory + ", " + imageURL + ", " + link +
                ", " + rating + ", " + nRatings + ", " + discountPrice + ", " + actualPrice + "]";
    }
}


