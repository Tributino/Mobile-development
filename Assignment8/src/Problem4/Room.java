package Problem4;

public class Room {
	private int number;
	private boolean locked;
	
	
	public Room(int number, boolean locked) {
		this.number = number;
		this.locked = locked;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	
	
	
	

}
