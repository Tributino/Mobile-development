package Problem5;

import java.util.Observable;

public class TemperatureSensor extends Observable  {
	private int temperature;
	
	
	

	public TemperatureSensor(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		setChanged();
        notifyObservers(temperature);
	} 
	
	
	
	

}
