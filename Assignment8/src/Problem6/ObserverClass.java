package Problem6;


import java.util.Observable;
import java.util.Observer;


public class ObserverClass<T> implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		if(arg == "add") {
		
		System.out.println("It was added a element to the list");
	    }
		else {
			System.out.println("It was removed a element to the list");
		}
		
	}

	
	

}
