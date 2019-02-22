package Problem4;

import java.util.Observable;
import java.util.Observer;

public class Manager implements Observer {
	

	@Override
	public void update(Observable observable, Object arg) {
		
		if(arg == "open"){
		        System.out.println("\nSomeone opened the door without permission. The police are being called.");
		}
		 if(arg =="close") {
			 System.out.println("\nA door was closed");
		 }

	}	
	

}
