package Problem5;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherStation extends Observable implements Observer {
	ArrayList<Integer> temperatureList = new ArrayList<Integer>();
	ArrayList<Integer> humidityList = new ArrayList<Integer>();
	ArrayList<Integer> pressureList = new ArrayList<Integer>();
	
	@Override
	public void update(Observable o, Object arg) {
		 if (o instanceof TemperatureSensor) {  
			int indexT = ((TemperatureSensor) o).getTemperature();
			temperatureList.add(indexT);
			System.out.println("**");
			setChanged();
	        notifyObservers(temperatureList);
		
	       } else if (o instanceof HumiditySensor) {
	    	   int indexT = ((HumiditySensor) o).getHumidity();
	    	   humidityList.add(indexT);
	    	   System.out.println("**");
	    	   setChanged();
		       notifyObservers(humidityList);
				
	          
	       } else if (o instanceof PressureSensor){
	    	   int indexT = ((PressureSensor) o).getPressure();
	    	   pressureList.add(indexT);
	    	   System.out.println("**");
	    	   setChanged();
		       notifyObservers(pressureList);
				
	         
	       } else {
	    	   // something extra
	       }
	    	   
	}

	

}
