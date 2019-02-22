package ProblemFrom1To3;
import java.util.ArrayList;

public class GenericSearchList {
	
static<T extends Iterable<U>, U> ArrayList<U> search(T myT, Predicate<U> p) {
		
		ArrayList<U> us = new ArrayList<U>();
		for(U u : myT) {
			if(p.evaluate(u)) {
				us.add(u);	
		    }	
		}	
		return us;
		
	}

}
