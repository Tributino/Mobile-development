package Problem5;

import java.util.ArrayList;
import java.util.Iterator;

public class Database implements Iterable<DataPoint>{
	ArrayList<DataPoint> data;
	
	

	public Database(ArrayList<DataPoint> data) {
		this.data = data;
	}



	@Override
	public Iterator<DataPoint> iterator() {
		return new DataBaseIterator(this.data); 
	}



	public ArrayList<DataPoint> getData() {
		return data;
	}



	public void setData(ArrayList<DataPoint> data) {
		this.data = data;
	}

	
	
	
	
}
