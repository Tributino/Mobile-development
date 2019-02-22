package Assignment6;

public class Product extends Object {
	int productId;
	String productName;
	float productPrice;
	String productMadeInCountry;
	
	public Product(int productId, String productName, float productPrice, String productMadeInCountry) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productMadeInCountry = productMadeInCountry;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductMadeInCountry() {
		return productMadeInCountry;
	}

	public void setProductMadeInCountry(String productMadeInCountry) {
		this.productMadeInCountry = productMadeInCountry;
	}
	
	
 
}
