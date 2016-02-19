import java.util.Iterator;

public class MenuItem extends MenuComponent {
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean vegetariano;

	public MenuItem(String nombre, String descripcion, double precio, boolean vegetariano) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.descripcion = descripcion;
		this.vegetariano = vegetariano;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public boolean vegetariano() {
		return vegetariano;
	}

	@Override
	public void print() {
		System.out.print("\n" + nombre);
		System.out.println(", " + descripcion);
		if (vegetariano) {
			System.out.println("(v)");
		}
		System.out.println("-----" + precio);
	}

	@Override
	public void printMenuVegetariano() {
		if (vegetariano()) {
			print();
		}

	}

}