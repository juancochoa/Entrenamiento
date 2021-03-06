
public class SingletonSimple {
	private static SingletonSimple uniqueInstance;
	private String nombre;

	private SingletonSimple() {
	}

	public static SingletonSimple getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonSimple();
		}
		return uniqueInstance;
	}

	public void imprimir() {
		System.out.println("oe " + this.nombre);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
