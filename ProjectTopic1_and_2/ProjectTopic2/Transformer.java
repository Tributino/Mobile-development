package ProjectTopic2;





import java.util.Arrays;
import java.util.function.Function;

public class Transformer implements Comparable<Transformer> {
	
	
	final int alldestroyed = 666;
	
	private String name;
	private int strength;
	private int intelligence;
	private int speed;
	private int endurance;
	private int rank;
	private int courage;
	private int firepower;
	private int skill;
	private int overallRating;
	
	
	public Transformer(String name, int[] arr) {
		this.name = name;
		this.strength = arr[0];
		this.intelligence = arr[1];
		this.speed = arr[2];
		this.endurance = arr[3];
		this.rank = arr[4];
		this.courage = arr[5];
		this.firepower = arr[6];
		this.skill = arr[7];
		this.overallRating = arr[0]+arr[1]+arr[2]+arr[3]+arr[6];
	}


	public String getName() {
		return name;
	}


	public int getstrength() {
		return strength;
	}


	public int getIntelligence() {
		return intelligence;
	}


	public int getSpeed() {
		return speed;
	}


	public int getEndurance() {
		return endurance;
	}


	public int getRank() {
		return rank;
	}


	public int getCourage() {
		return courage;
	}


	public int getFirepower() {
		return firepower;
	}


	public int getSkill() {
		return skill;
	}
	
	public int getOverallRating() {
		return overallRating;
	}
	
	// It's going to be used by next method
	Function<Transformer,int[]> criterias = (t)->{
		int[] arr = new int[8];
		arr[0] = t.getstrength();
		arr[1] = t.getIntelligence();
		arr[2] = t.getSpeed();
		arr[3] = t.getEndurance();
		arr[4] = t.getRank();
		arr[5] = t.getCourage();
		arr[6] = t.getFirepower();
		arr[7] = t.getSkill();
		
		return arr;
	};
	
	// It shows us the criteria points. Example: [8,8,2,8,7,9,7,9], where the index 0 mean the Strength.
	public void power() {
		 int[] arr = criterias.apply(this);
		System.out.print(Arrays.toString(arr));
	}
	
	 
    // If any fighter is down 4 or more points of courage and 3 or more points of
	//strength  compared to their opponent, the opponent automatically wins the
	//face-off. Otherwise, if one of the fighters is 3 or more points of skill above their
	//opponent, they win  the fight regardless of overall rating (100 mean win, -100 lost).
	Function<Transformer,Integer> compareBycriterias = (t2)->{
		if((this.courage-4>=t2.courage && this.strength-3>=t2.strength) || (this.skill-3>=t2.skill)) return 100;
		if((t2.courage-4>=this.courage && t2.strength-3>=this.strength) || (t2.skill-3>=this.skill)) return -100;
		else return this.getOverallRating();
	};
	
	// The winner is the Transformer with the highest overall rating (100 mean win, -100 lost).
	Function<Transformer,Integer> compareByOverallRating =	(t2)->{
		if(this.overallRating-t2.overallRating>0) {
			return 100;
		}
		return -100;	
	};
	
	// class Transformer is comparable. we are using 3 criteria; 2 are above and the last is: Any Transformer 
	//named Optimus Prime or Predaking wins his fight automatically regardless of any other criteria, and
	//in the event either of the above face each other (or a duplicate of each other), the game immediately 
	//ends with all competitors destroyed. The method return 100(win), -100(lost) and 
	//666(all Transforme will be destroyed)
	
	@Override
	public int compareTo(Transformer o) {
		if((this.name=="Optimus Prime" || this.name=="Predaking") 
    			&& (o.name!="Optimus Prime" && o.name!="Predaking")) return 100 ;
		else if((o.name=="Optimus Prime" || o.name=="Predaking") 
    			&& (this.name!="Optimus Prime" && this.name!="Predaking")) return -100 ;
		else if((this.name!="Optimus Prime" && this.name!="Predaking") && (o.name!="Optimus Prime" && o.name!="Predaking")) {
			int x = compareBycriterias.apply(o);
			if(Math.abs(x)==100)
				return x;
			else
				return compareByOverallRating.apply(o);
			}
		return alldestroyed;
		
	}


	

	

}
