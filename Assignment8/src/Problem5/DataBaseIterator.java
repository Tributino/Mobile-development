package Problem5;

import java.util.ArrayList;
import java.util.Iterator;

public class DataBaseIterator implements Iterator<DataPoint> {
	ArrayList<DataPoint> dataPoints;
	int currIntex=0;
	
	public DataBaseIterator(ArrayList<DataPoint> dataPoints) {
		this.dataPoints = dataPoints;
	}

	@Override
	public boolean hasNext() {
		if(this.currIntex<this.dataPoints.size()) {
			return true;
		}
		return false;
	}

	@Override
	public DataPoint next() {
		if(hasNext()) {
			DataPoint dP = this.dataPoints.get(currIntex);
			currIntex++;
			return dP;
		}
		return null;
	}
	
	

}
