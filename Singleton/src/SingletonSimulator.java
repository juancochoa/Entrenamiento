
public class SingletonSimulator {
	public static void main(String[] args) {
		SingletonSimple prueba=SingletonSimple.getInstance();
		prueba.setNombre("Camilo");
		prueba.imprimir();
		SingletonSimple otraInstancia=SingletonSimple.getInstance();
		otraInstancia.setNombre("Laura");
		otraInstancia.imprimir();
		prueba.imprimir();
	}
}
