package ProjectTopic1;

import java.util.Iterator;

public class Land implements Iterable<Integer> {
	private int[] arr;
	
	

	public Land(int[] arr) {
		this.arr = arr;
	}


	@Override
	public Iterator<Integer> iterator() {
		return new LandIterator(arr);
	}



	public int[] getArr() {
		return arr;
	}
	
	
	

}
