package Problem5;

public class DataPoint {
	
	private dataCategory category;
	private int newValue;
	
	
	public DataPoint(dataCategory category, int newValue) {
		this.category = category;
		this.newValue = newValue;
	
	}


	public dataCategory getCategory() {
		return category;
	}


	public void setCategory(dataCategory category) {
		this.category = category;
	}


	public int getNewValue() {
		return newValue;
	}


	public void setNewValue(int newValue) {
		this.newValue = newValue;
	}
	
	

}
