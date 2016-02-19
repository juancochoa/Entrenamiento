package pruebaJavaObserver;

public class ObserverSimulation {
	public static void main(String[] args) {
		WeatherData subject=new WeatherData();
		CurrentConditionsDisplay conditions=new CurrentConditionsDisplay(subject);
		subject.setMeasurements(45, 34, 82f);
		subject.setMeasurements(20, 55, 70f);
		subject.setMeasurements(49, 54, 82f);
		subject.setMeasurements(78, 87, 82f);
		conditions.UnRegister();
		subject.setMeasurements(34, 87, 82f);
		boolean si=true;
		if(!si)
		System.out.println("oe");
	}
}
