package ProjectTopic2;



import java.util.ArrayList;


import ProjectTopic2.Team.Gang;



public class ApplicationDriver {

	public static void main(String[] args) {
		// Autobots
	       int[] blaster = {8,8,2,8,7,9,7,9};
	       int[] cloudraker = {6,6,8,6,5,7,6,6};
	       int[] fastlane = {6,3,6,6,5,9,7,7};
	       int[] freeway = {3,6,4,6,6,8,3,9};
	       int[] grapple = {8,8,3,4,7,7,7,9};
	       Transformer A0 = new Transformer("Blaster", blaster);
	       Transformer A1 = new Transformer("Cloudraker", cloudraker);
	       Transformer A2 = new Transformer("Fastlane", fastlane);
	       Transformer A3 = new Transformer("Freeway", freeway);
	       Transformer A4 = new Transformer("Grapple", grapple);
	       ArrayList<Transformer> As = new ArrayList<Transformer>();
	       As.add(A0); As.add(A1); As.add(A2); As.add(A3); As.add(A4);
	       Team autobot = new Team(Gang.AUTOBOTS, As) {

			@Override
			public void celebration() {
					System.out.println("Let's drink some beers."); // The way the Autobots celebrate 
			}
	    	   
	       };
	    	   
	       
	       // Deceptions
	       int[] barrage = {3,8,3,7,5,10,9,8};
	       int[] bombshell = {5,8,4,5,6,5,6,9};
	       int[] breakdown = {6,7,7,5,6,8,6,6};
	       int[] chopShop = {7,8,4,5,6,7,6,10};
	       Transformer D0 = new Transformer("Barrage", barrage);
	       Transformer D1 = new Transformer("Predaking", bombshell);
	       Transformer D2 = new Transformer("Breakdown", breakdown);
	       Transformer D3 = new Transformer("Chop Shop", chopShop);
	       ArrayList<Transformer> Ds = new ArrayList<Transformer>();
	       Ds.add(D0); Ds.add(D1); Ds.add(D2); Ds.add(D3); 
	       Team deception = new Team(Gang.DECEPTIONS, Ds) {

			@Override
			public void celebration() {
				System.out.println("Let's go dominated the world."); // The way the Deceptions celebrate
				
			}
	    	   
	       };
	       
	      
	       
	      FightingArena fA = new FightingArena(autobot, deception);
	      fA.duelsAndResults();
	      fA.result();
	      
	      
	      

	      
	     
	}
	       

}
