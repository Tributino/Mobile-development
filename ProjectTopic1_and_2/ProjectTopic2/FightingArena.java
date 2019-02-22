package ProjectTopic2;



import java.util.ArrayList;
import java.util.function.BiFunction;

import ProjectTopic2.Team.Gang;

public class FightingArena {
	final int alldestroyed = 666;
	private Team autobot;
	private Team deception;
	private int theNumberOfBattles; 
	
	public FightingArena(Team autobot, Team deception) {
		this.autobot = autobot;
		this.deception = deception;
		this.theNumberOfBattles = Math.min(autobot.getTeam().size(),deception.getTeam().size());
		
		//  Receive the 2 teams and return the fights of the Autobots team
		BiFunction<Team, Team,ArrayList<Transformer>> a = (A,B)->{
			if(A.getName()==Gang.AUTOBOTS)
				return A.getTeam();
			else
				return B.getTeam();
		};
	   //  Receive the 2 teams and return the fights of the Deceptions team
		BiFunction<Team, Team,ArrayList<Transformer>> d = (A,B)->{
			if(A.getName()==Gang.DECEPTIONS)
				return A.getTeam();
			else
				return B.getTeam();
		};
		
		ArrayList<Transformer> autobots = a.apply(autobot, deception);
		ArrayList<Transformer> deceptions = d.apply(deception, autobot);
		
		// It will save the transformer that won't fight(It's going straight to survivors list).
		if(autobots.size()>this.theNumberOfBattles) {
			for(int j=theNumberOfBattles; j<autobots.size();j++) {
				
				autobot.getSurvivors().add(autobots.get(j));
			}
			
		}
		if(deceptions.size()>this.theNumberOfBattles) {
			for(int j=theNumberOfBattles; j<deceptions.size();j++) {
				deception.getSurvivors().add(deceptions.get(j));
			}
			
		}
		
		
		for(int i=0;i<theNumberOfBattles;i++) {
			Transformer t1 = autobots.get(i);
			Transformer t2 = deceptions.get(i);
			//This will destroyed everyone
			if(t1.compareTo(t2)==666) {
				autobot.getSurvivors().removeAll(autobot.getSurvivors());
				deception.getSurvivors().removeAll(deception.getSurvivors());
				break;
			}
			// This will save the autobots winner.
			if(t1.compareTo(t2)==100) {
				autobot.getSurvivors().add(t1);
			}
			// This will save the deception winner.
			if(t2.compareTo(t1)==100) {
				deception.getSurvivors().add(t2);
			}

		}			
		
	}	   	
		//Print the result is the survivors of the winning team, if any. 
		//The result can be a draw when both are the same amount of survivors.
		public void result() {
			
			if(autobot.getSurvivors().size()==0 && deception.getSurvivors().size()==0) {
				autobot.setWinner(false);
				deception.setWinner(false);
				System.out.println("All competitors were destroyed");
			
			}
			if(autobot.compareTo(deception)>0) {
				autobot.setWinner(true);
				deception.setWinner(false);
				System.out.println("The Autobot Team is the winner");
				System.out.println("--------- Survivors ----------");
				//The following action prints the autobot survivors with a for-each loop:
				for(Transformer t : autobot) {
					System.out.print(t.getName());
					t.power();
					System.out.print("\n");
				}
			}
			if(autobot.compareTo(deception)<0) {
				System.out.println("The Deception Team is the winner");
				autobot.setWinner(false);
				deception.setWinner(true);
				System.out.println("------ Survivors ------");
				//The following action prints the deception survivors but with the aggregate operation forEach:
				deception
				.getSurvivors()
				.forEach(t->{System.out.print(t.getName()); 
							t.power();
							System.out.print("\n");
				});
				
			    
				
			}
			if(autobot.compareTo(deception)==0 && autobot.getSurvivors().size()!=0) {
				autobot.setWinner(false);
				deception.setWinner(false);
				System.out.println("We have a draw");
				System.out.println("------ Autobot Survivors ------");
				for(Transformer t : autobot) {
					System.out.print(t.getName());
					t.power();
					System.out.print("\n");
				}
				System.out.println("---- Deception Survivors ------");
				for(Transformer t : deception) {
					System.out.print(t.getName());
					t.power();
					System.out.print("\n");
				}
			}
		}
		
		
		// prints who will fight who, and the result.
		public void duelsAndResults() {
			System.out.println("===================================================================");
			for(int i=0;i<theNumberOfBattles;i++) {
				System.out.println(autobot.getTeam().get(i).getName() + " vs " 
			            + deception.getTeam().get(i).getName() 
						+ " : Result = " + autobot.getTeam().get(i).compareTo(deception.getTeam().get(i))
				        + " , " + deception.getTeam().get(i).compareTo(autobot.getTeam().get(i)));
			}
			System.out.println("===================================================================");
		}
	

}
