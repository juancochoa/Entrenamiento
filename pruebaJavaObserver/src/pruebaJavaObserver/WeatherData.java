package pruebaJavaObserver;

import java.util.Observable;

public class WeatherData extends Observable {
	private float humidity;
	private float pressure;
	private float temperature;

	public WeatherData() {
	}
	
	public void setMeasurements(float temperature, float pressure, float humidity){
		this.humidity=humidity;
		this.pressure=pressure;
		this.temperature=temperature;			
		measurementsChanged();
		notifyObservers();
	}

	private void measurementsChanged() {
		setChanged();

	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public float getTemperature() {
		return temperature;
	}
}
