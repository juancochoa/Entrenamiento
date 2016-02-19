import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffe extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping coffe");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	public boolean customersWantsCondiments() {
		String respuesta = getRespuesta();;
		if(respuesta.toLowerCase().equals("y")){
			return true;
		}
		else{
			return false;
		}
	}

	private String getRespuesta() {
		String respuesta = null;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Milk and sugar? (y/n)");
		try {
			respuesta = entrada.readLine();

			
		} catch (IOException e) {
			System.out.println("entrada invalida");
		}
		if (respuesta == null) {
			respuesta = "n";
		}
		return respuesta;
	}
}
