package Problem6;

import java.util.ArrayList;

public class ApplicationDriver {

	public static void main(String[] args) {
		String animal1 = "gat";
		String animal2 = "dog";
		String animal3 = "horse";
		String animal4 = "duck";
		String animal5 = "lamb";
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		ObservableClass<String> oC = new ObservableClass<String>(animals);
		
		ObserverClass<String> observer = new ObserverClass<String>();
		
		oC.addObserver(observer);
		
		oC.add("ant");
		oC.remove("horse");

	}

}
