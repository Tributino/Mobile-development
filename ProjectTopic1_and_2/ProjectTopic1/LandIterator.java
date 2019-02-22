package ProjectTopic1;

import java.util.Iterator;
import java.util.function.BiPredicate;

public class LandIterator implements Iterator<Integer> {
	int currPosition;
	int[] arr;
	
	

	public LandIterator(int[] arr) {
		
		this.arr = arr;
	}
	
	BiPredicate<Integer, Integer> bi = (a, b) -> {
		if(a!=b) {
			return true;
		}
		return false;
		
	};
	
	
	@FunctionalInterface
	interface Index {
		int operation(int i);
	}
	
	

	@Override
	public boolean hasNext() {
		if(currPosition<arr.length) {
			return true;
		}
		return false;
	}

	@Override
	public Integer next() {
		//Lambda function to jump the index that has the same value of the current index.
		Index current = (i)->{ 
			while (i < arr.length-1) {
	            if (bi.test(arr[i+1],arr[i])) return i+1;
	            else i=i+1;
	        }
	        return arr.length;
		};
		//Jump the index that have the same value
		if(hasNext()) {
			int i = currPosition;
			currPosition=current.operation(currPosition);
			return i;
			}
		return null;
	}
	
	
	
	

}
