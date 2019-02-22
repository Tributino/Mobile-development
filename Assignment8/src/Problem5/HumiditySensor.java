package Problem5;

import java.util.Observable;

public class HumiditySensor extends Observable {
	private int humidity;
	

	public HumiditySensor(int humidity) {
		this.humidity = humidity;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		setChanged();
        notifyObservers(humidity);
	}
	
	
	
	

}
