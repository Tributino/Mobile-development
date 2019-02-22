package Problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationDriver {

	public static void main(String[] args) {
		
		Room room1 = new Room(1, true);
		Room room2 = new Room(2, true);
		Room room3 = new Room(3, true);
		Room room4 = new Room(4, true);
		Room room5 = new Room(5, true);
		
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		rooms.add(room4);
		rooms.add(room5);
		
		Manager Susan = new Manager();
		
		Building hotel = new Building("English Bay", 1968, rooms);
		
		hotel.addObserver(Susan);
		
		System.out.println("Input a number from 1 to 5 :");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		Intruder.unauthorizedAccess(hotel, i);
		
		for(Room r : hotel.getRooms()) {
			if(r.getNumber()==i)
				hotel.close(r);
		}
		
    
	}

}
