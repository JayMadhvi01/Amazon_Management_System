package AmazonSystem;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;

public class AmazonCart  {
   private AmazonCustomer customer;
   Date date = new Date();
   private ArrayList<AmazonCartItem> items = new ArrayList<AmazonCartItem>();
   private float totalValue;
    
    public AmazonCart(AmazonCustomer customer, Date date) {
    	this.customer = customer;
    	this.date = date;
    }
    
    public float calcSubTotal(float total) {
    	this.totalValue = total;
        for(AmazonCartItem item: items) {
        	total = total + item.calcSubTotal();
        }
        return total;
    }
    
    public AmazonCartItem getItem(int id) {
		return null;
	}

	public boolean hasItem(AmazonProduct pr) {
         if(items.size() == 0)
        	 return false;
         return true;
	}
    
    public boolean pay(float totalValue) {
    	return false;
    }
    
    public void addItem(AmazonCartItem item) {
    	items.add(item);
    }
    
    public void removeItem(AmazonProduct product) {
        items.remove(product);	
    }
    
   /* public String getCartDetails() {
    	return null;
    }*/

	@Override
	public String toString() {
		return "AmazonCart [customer=" + customer + ", items=" + items + ", totalValue=" + totalValue + "]";
	}
    
    
    
}
