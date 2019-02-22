package Assignment6;

import java.util.ArrayList;


public class ShoppingCart {
	private ArrayList<Drink> drinks;
	private ArrayList<Food> foods;
	private ArrayList<Cloth> cloths;
	private double total;
	
	


	public ShoppingCart(ArrayList<Drink> drinks, ArrayList<Food> foods, ArrayList<Cloth> cloths) {
		this.drinks = drinks;
		this.foods = foods;
		this.cloths = cloths;
	}

	public double setClothAndAmount(Cloth c, int amountList) {
		double cost = amountList*c.productPrice;
		return cost;
	}

	public double setFoodAndAmount(Food f, int amount) {
		double cost = amount*f.productPrice;
		return cost;
	}

	public double setDrinkAndAmount(Drink d, int amount) {
		double cost = amount*d.productPrice;
		return cost;
	}
	
	public double calculateDrinks(int[] amountList) {
		int sum=0;
		int i=0;
		for(Drink d : drinks) {
			sum+= setDrinkAndAmount(d,amountList[i]);
			i++;
		}
		return sum;
	}
	
	public double calculateFoods(int[] amountList) {
		int i=0;
		int sum=0;
		for(Food f : foods) {
			sum+=setFoodAndAmount(f, amountList[i]);
		}
		return sum;
	}
	
	public double calculateCloths(int[] amountList) {
		int i=0;
		int sum=0;
		for(Cloth c : cloths ) {
			sum+=setClothAndAmount(c,amountList[i]);
			i++;
		}
		return sum;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void showTotal() {
		System.out.println("SubTotal " + total);
		System.out.println("tax      " + 0.05*total);
		System.out.println("------------------");
		System.out.println("Total    " + (1.05)*total);
	}
	
	public void printNames(){
		System.out.println("------Items-------");
		for(Food f:foods) {
			System.out.println(f.getProductName());
			
		}
		for(Drink d:drinks) {
			System.out.println(d.getProductName());
		}
		for(Cloth c:cloths) {
			System.out.println(c.getProductName());
			
		}
	}

}
