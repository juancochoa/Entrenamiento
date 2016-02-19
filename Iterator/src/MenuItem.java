
public class MenuItem {
	private String nombre;
	private String descripcion;
	private boolean vegetariano;
	private double precio;
	
	public MenuItem(String nombre, String descripcion, boolean vegetariano, double precio) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.vegetariano=vegetariano;
		this.precio=precio;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public boolean getVegetariano(){
		return vegetariano;
	}
}