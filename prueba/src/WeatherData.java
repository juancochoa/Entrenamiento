import java.util.ArrayList;


public class WeatherData implements Subject {
	private ArrayList<Observer> observadores;
	private float temperature;
	private float pressure;
	private float humidity;
	public WeatherData() {
		observadores=new ArrayList();
	}
	@Override
	public void registerObserver(Observer o) {
		observadores.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		int index=observadores.indexOf(o);
		if(index>=0)
		observadores.remove(index);
	}
	@Override
	public void notifyObservers() {
		for (int i = 0; i < observadores.size(); i++) {
			Observer obs=(Observer)observadores.get(i);
			//obs.update(this.temperature, this.humidity, this.pressure);
			obs.update();
		}
	}
	private void measurementsChanged(){
		notifyObservers();
	}
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
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
