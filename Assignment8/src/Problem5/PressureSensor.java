package Problem5;

import java.util.Observable;

public class PressureSensor extends Observable {
	private int pressure;
	
	

	public PressureSensor(int pressure) {
		this.pressure = pressure;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		setChanged();
        notifyObservers(pressure);
	}
	
	
	

}
