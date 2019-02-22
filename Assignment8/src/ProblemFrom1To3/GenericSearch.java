package ProblemFrom1To3;

public class GenericSearch {
	
	
	static<T extends Iterable<U>, U> void search(T myT, Predicate<U> p) {
		
		int count = 0;
		for(U u : myT) {
			if(p.evaluate(u)) {
				count++;	
		    }	
		}	
		System.out.println(count);
		
	}
	
	

}
