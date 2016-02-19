
public class CurrentConditionsDisplay implements Observer {
	
	private Subject observable;
	private float humidity;
	private float temperature;
	
	public CurrentConditionsDisplay(Subject observable) {
		this.observable=observable;
		this.observable.registerObserver(this);
	}
	@Override
	/*public void update(float temperature, float humidity, float pressure) {
		this.humidity=humidity;
		this.temperature=temperature;
		display();
	}*/
	public void update(){
		if(this.observable instanceof WeatherData){
			this.humidity=((WeatherData)this.observable).getHumidity();
			this.temperature=((WeatherData)this.observable).getTemperature();
			display();
		}
	}
	public void unRegister(){
		this.observable.removeObserver(this);
	}
	private void display(){
		System.out.println("temperature: " + this.temperature + "F degrees humidity: " + this.humidity +"%");
	}

}
