package Problem5;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class NewStation implements Observer {
	
	

	@Override
	public void update(Observable o, Object arg) {
		
		// Temperature Average
		if(arg == ((WeatherStation) o).temperatureList) {
			ArrayList<Integer> temperatureList = ((WeatherStation) o).temperatureList;
			int sum = 0;
			if(!temperatureList.isEmpty()) {
				for(Integer t : temperatureList) {
					sum+=t;
				}
				float averageTemperature = sum/temperatureList.size();
				System.out.println("Temperature Average: " + averageTemperature);
			}
		}
		
		else if(arg == ((WeatherStation) o).humidityList) {
			ArrayList<Integer> humidityList = ((WeatherStation) o).humidityList;
			int sum1 = 0;
			if(!humidityList.isEmpty()) {
				for(Integer t : humidityList) {
					sum1+=t;
				}
				float averagehumidity = sum1/humidityList.size();
				System.out.println("Humidity Average: " + averagehumidity);
			}
			
		}
		else if(arg == ((WeatherStation) o).pressureList) {
			ArrayList<Integer> pressureList = ((WeatherStation) o).pressureList;
			int sum2 = 0;
			if(!pressureList.isEmpty()) {
				for(Integer t : pressureList) {
					sum2+=t;
				}
				float averagepressure = sum2/pressureList.size();
				System.out.println("Pressure Average: " + averagepressure);
			}
			
		}
		else {
			System.out.println("look your class WeatherStation");
		}
			
			}
	

	

}
