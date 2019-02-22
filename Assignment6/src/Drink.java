package Assignment6;

public class Drink extends Product {
	boolean isDrinkDiet;
	int drinkSize;
	
	public Drink(int productId, String productName, float productPrice, String productMadeInCountry,
			boolean isDrinkDiet, int drinkSize) {
		super(productId, productName, productPrice, productMadeInCountry);
		this.isDrinkDiet = isDrinkDiet;
		this.drinkSize = drinkSize;
	}

	public boolean isDrinkDiet() {
		return isDrinkDiet;
	}

	public void setDrinkDiet(boolean isDrinkDiet) {
		this.isDrinkDiet = isDrinkDiet;
	}

	public int getDrinkSize() {
		return drinkSize;
	}

	public void setDrinkSize(int drinkSize) {
		this.drinkSize = drinkSize;
	}
	

}
