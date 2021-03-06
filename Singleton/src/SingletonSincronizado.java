
public class SingletonSincronizado {
	private static SingletonSincronizado uniqueInstance;
	private String nombre;

	private SingletonSincronizado() {
	}

	public synchronized static SingletonSincronizado getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonSincronizado();
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
