package Assignment6;

public class Food extends Product {

	int foodCalorie;
	int foodSize;
	String[] foodIngredients;
	public Food(int productId, String productName, float productPrice, String productMadeInCountry, int foodCalorie,
			int foodSize, String[] foodIngredients) {
		super(productId, productName, productPrice, productMadeInCountry);
		this.foodCalorie = foodCalorie;
		this.foodSize = foodSize;
		this.foodIngredients = foodIngredients;
	}
	public int getFoodCalorie() {
		return foodCalorie;
	}
	public void setFoodCalorie(int foodCalorie) {
		this.foodCalorie = foodCalorie;
	}
	public int getFoodSize() {
		return foodSize;
	}
	public void setFoodSize(int foodSize) {
		this.foodSize = foodSize;
	}
	public String[] getFoodIngredients() {
		return foodIngredients;
	}
	public void setFoodIngredients(String[] foodIngredients) {
		this.foodIngredients = foodIngredients;
	}
	
}
