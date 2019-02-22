package Problem4;

import java.util.ArrayList;
import java.util.Observable;

public class Building extends Observable {
	private String name;
	private int yearbuild;
	private ArrayList<Room> rooms;
	
	
	
	
	public Building(String name, int yearbuild, ArrayList<Room> rooms) {
		this.name = name;
		this.yearbuild = yearbuild;
		this.rooms = rooms;
	}

	public void open(Room currRoom) {
		int roomNumber = currRoom.getNumber();
		if(currRoom.isLocked()) {
			currRoom.setLocked(false);
			System.out.printf("The room %d is unlocked " , roomNumber);
		}
		else {
			System.out.printf("The room %d is already unlocked " , roomNumber);
		}
		setChanged();
	    notifyObservers("open");
		}
	
	
	
	public void close(Room currRoom) {
		int roomNumber = currRoom.getNumber();
		if(!currRoom.isLocked()) {
			currRoom.setLocked(true);	
		}
		else {
			System.out.printf("The room %d is already locked " , roomNumber);
		}
		setChanged();
	    notifyObservers("close");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearbuild() {
		return yearbuild;
	}

	public void setYearbuild(int yearbuild) {
		this.yearbuild = yearbuild;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	

}
