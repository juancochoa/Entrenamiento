package pruebaJavaObserver;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
	Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	public void UnRegister(){
		this.observable.deleteObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			this.temperature = ((WeatherData) o).getTemperature();
			this.humidity = ((WeatherData) o).getHumidity();
			display();
		}
	}

	public void display() {
		System.out.println("temperature: " + this.temperature + "F degrees humidity: " + this.humidity +"%");
	}

}
