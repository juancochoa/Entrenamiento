
public class SingletonDouble {
	private volatile static SingletonDouble uniqueInstance;
	private String nombre;

	private SingletonDouble() {
	}

	public static SingletonDouble getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonDouble.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonDouble();
				}
			}
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
