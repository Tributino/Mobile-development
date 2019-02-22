package ProjectTopic2;

import java.util.ArrayList;
import java.util.Iterator;


public class TeamIterator implements Iterator<Transformer> {
	
	private int currTransforme;
	private ArrayList<Transformer> team;
	
	
	

	public TeamIterator(ArrayList<Transformer> team) {
		this.team = team;
	}



	@Override
	public boolean hasNext() {
		if(currTransforme<team.size()) {
			return true;
		}
		return false;
	}
	
	

	@Override
	public Transformer next() {
		if(hasNext()) {
			Transformer t = team.get(currTransforme);
			currTransforme++;
			return t;
			}
		return null;
	}

}
