package AmazonSystem;

public class AmazonProductSubCategory {
	 private AmazonProductCategory category;
	    private String subCategoryName;

	    public AmazonProductSubCategory(String subCategoryName, AmazonProductCategory category) {
	        this.category = category;
	        this.subCategoryName = subCategoryName;
	    }

	    public String getSubCategory() {
	        return subCategoryName;
	    }

	    public AmazonProductCategory getCategory() {
	        return category;
	    }
	    public void setCategory( AmazonProductCategory category) {
	        this.category = category;
	    }

	public void setSubCategory(String subCategoryName) {
	    this.subCategoryName = subCategoryName;
	}
}
