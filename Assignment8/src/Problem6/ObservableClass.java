package Problem6;

import java.util.ArrayList;
import java.util.Observable;



public class ObservableClass<T> extends Observable{
	
	private ArrayList<T> list;

    
    public ObservableClass(ArrayList<T> list) {
		this.list = list;
	}
	public void add(T add){
        list.add(add);
        setChanged();
        notifyObservers("add");
        
    }
    public void remove(T remove){
         list.remove(remove);
         setChanged();
         notifyObservers("remove");
         
    }
         

   

}
