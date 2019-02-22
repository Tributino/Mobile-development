package Problem4;


public class Intruder {
	
	
	public static void unauthorizedAccess(Building stolening, int i)  {
		
		for(Room r : stolening.getRooms()) {
			if(r.getNumber()==i) {
				stolening.open(r);
	    		break;
	    	}
		}
		
		
	}

}
