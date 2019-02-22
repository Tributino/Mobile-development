package ProjectTopic2;


import java.util.ArrayList;
import java.util.Iterator;

public abstract class Team implements Comparable<Team>, Iterable<Transformer>  {
	
	public enum Gang {
	    AUTOBOTS,
		DECEPTIONS,
		
}
	private Gang name;
	private ArrayList<Transformer> team;
	private boolean winner;
	private ArrayList<Transformer> survivors = new ArrayList<Transformer>();
	
	
	
	public Team(Gang name, ArrayList<Transformer> team) {
		this.name = name;
		this.team = team;
			
	}
	
	// We're gonna define different celebrations for Autobots and Deceptions.
	public abstract void celebration();
	

	public Gang getName() {
		return name;
	}
	
	public ArrayList<Transformer> getSurvivors() {
		return survivors;
	}
	
	
	public void setSurvivors(ArrayList<Transformer> survivors) {
		this.survivors = survivors;
	}


	public ArrayList<Transformer> getTeam() {
		return team;
	}
	
	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	
	
	
    // The team who eliminated the largest number of the opposing team is the winner;
	// with the method below, we can obtain the result
	@Override
	public int compareTo(Team o) {
	
		return this.survivors.size()-o.survivors.size();
	}

    // The method below we are making the iterator goes through the survivors.
	@Override
	public Iterator<Transformer> iterator() {
		
		return new TeamIterator(survivors);
	}

	


	


	


	


	
	
	
	
	

}
