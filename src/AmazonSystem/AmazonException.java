package AmazonSystem;

public class AmazonException extends Exception{
	 private static final long serialVersionUID = 0;

		public AmazonException(String message) {
	        super(message);
	        System.err.println("AmazonProductException: " + message);
	    }
}
