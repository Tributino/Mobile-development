package Assignment6;

import java.util.ArrayList;





public class ApplicationDrive {

	public static void main(String[] args) {
		
//		Product A = new Product(110, "Diet Pepsi", 2, "USA");
		
//		Drink drinkA = new Drink(001, "CocaCola", 2, "USA", false, 500);
		
		String[] ingreA = new String[4];
		ingreA[0]= "potatos";
		ingreA[1]= "salt";
		ingreA[2]= "garlic";
		ingreA[3]= "vinager";
		
//        Food foodA = new Food(002, "Chips", 3, "Canada", 500, 100, ingreA);
        
        Material[] matA = new Material[2];
        Material MaterialA = new Material(10, "Cotton" );
        Material MaterialB = new Material(11, "Nylon" );
        matA[0] = MaterialA;
        matA[1] = MaterialB;
        
//        Cloth clothA = new Cloth(003, "Short", 15, "China", matA);
        
        // START TO BUY
        
        //Drinks
        Drink d1 = new Drink(412,"Pepsi",2,"USA",false,150);
        Drink d2 = new Drink(183,"Ginger Zero",3,"Canada",true,200);
        ArrayList<Drink> drinks = new ArrayList<Drink>();
        drinks.add(0,d1);
        drinks.add(1,d2);
        int[] amountLD = new int[2];
        amountLD[0] = 3; amountLD[1]=1;
        
        //Foods
        String[] ingF1 = new String[3];
        ingF1[0]= "chicken";
        ingF1[1]= "oil";
        ingF1[2]= "chees";
        		
        Food f1 = new Food(100, "Chicken",8,"Canada",350,4,ingF1);
        
        
        String[] ingF2 = new String[3];
        ingF2[0]= "pasta";
        ingF2[1]= "meet";
        ingF2[2]= "spinach";
        
        Food f2 = new Food(101,"Pasta", 18,"Canada",250,3,ingF2);
        
        
        ArrayList<Food> foods = new ArrayList<Food>();
        foods.add(0,f1);
        foods.add(1,f2);
        
        int[] amountLF = new int[2];
        amountLF[0] = 2; amountLF[1]=2;
        
        //Cloths
        
        Cloth c1 = new Cloth(701, "T-shirt", 15,"China", matA);
       
        
        ArrayList<Cloth> cloths = new ArrayList<Cloth>();
        cloths.add(0,c1);
        
        int[] amountLC = new int[1];
        amountLC[0] = 2; 
        //end
        
        ShoppingCart sC = new ShoppingCart(drinks,foods,cloths);
        double x = sC.calculateFoods(amountLF);
        double y = sC.calculateDrinks(amountLD);
        double z = sC.calculateCloths(amountLC);
        double total = x+y+z;
        sC.setTotal(total);
        sC.showTotal();
        sC.printNames();

        
        
	}

}
