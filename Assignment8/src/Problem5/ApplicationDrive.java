package Problem5;

import java.util.ArrayList;
import java.util.Iterator;

public class ApplicationDrive {
	
	public static void main(String[] args) {
		
		
	DataPoint dP1 = new DataPoint(dataCategory.PRESSURE, 16);
	DataPoint dP2 = new DataPoint(dataCategory.HUMIDITY, 74);
	DataPoint dP3 = new DataPoint(dataCategory.PRESSURE, 102);
	DataPoint dP4 = new DataPoint(dataCategory.PRESSURE, 22);
	DataPoint dP5 = new DataPoint(dataCategory.HUMIDITY, 68);
	DataPoint dP6 = new DataPoint(dataCategory.PRESSURE, 98);
	DataPoint dP7 = new DataPoint(dataCategory.PRESSURE, 10);
	DataPoint dP8 = new DataPoint(dataCategory.HUMIDITY, 78);
	DataPoint dP9 = new DataPoint(dataCategory.PRESSURE, 104);
	
	ArrayList<DataPoint> data = new ArrayList<DataPoint>();
	data.add(dP1);
	data.add(dP2);
	data.add(dP3);
	data.add(dP4);
	data.add(dP5);
	data.add(dP6);
	data.add(dP7);
	data.add(dP8);
	data.add(dP9);
	
	
	WeatherStation wS = new WeatherStation();
	NewStation nS = new NewStation();

	
	HumiditySensor hS = new HumiditySensor(75) ;
	PressureSensor pS = new PressureSensor(100);
	TemperatureSensor tS = new TemperatureSensor(18);
	
	tS.addObserver(wS);
	pS.addObserver(wS);
	hS.addObserver(wS);
	wS.addObserver(nS);
	
	tS.setTemperature(45);
	hS.setHumidity(82);
	
	
	
	Database  dB = new Database(data);
	
	Iterator<DataPoint> it = dB.iterator();
	
	
	while(it.hasNext()) {
		DataPoint dP = it.next();
		if(dP.getCategory() == dataCategory.TEMPERATURE) {
			tS.setTemperature(dP.getNewValue());
		}
		else if(dP.getCategory() == dataCategory.HUMIDITY) {
			hS.setHumidity(dP.getNewValue());
		}
		else {
			pS.setPressure(dP.getNewValue());
		}
			
	}
	
	
	}

}
