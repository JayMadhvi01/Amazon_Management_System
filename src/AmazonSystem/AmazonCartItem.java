package AmazonSystem;

public class AmazonCartItem {
     AmazonProduct product;
     int quantity;
     
     AmazonCartItem(AmazonProduct product, int quantity){
    	 this.product = product;
    	 this.quantity = quantity;
     }
     
    public float calcSubTotal() {
    	float total = 0.0f;
    	total = product.getActualPrice()* quantity;
    	return total;
    }
    
    public String toString() {
    	return "["+product.getId()+", "+product.getName()+"], Quantity: "+quantity+"* Total Values: "+calcSubTotal();
    }
}
