import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	private ArrayList<MenuComponent> menuComponentes = new ArrayList();
	private String nombre;
	private String descripcion;

	public Menu(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponentes.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponentes.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponentes.get(i);
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
	public void print() {
		System.out.print("\n" + nombre);
		System.out.println(", " + descripcion);
		System.out.println("----------------");
		Iterator<MenuComponent> it = menuComponentes.iterator();
		while (it.hasNext()) {
			MenuComponent menu = it.next();
			menu.print();
		}
	}

	@Override
	public void printMenuVegetariano() {
		Iterator<MenuComponent> it = menuComponentes.iterator();
		while (it.hasNext()) {
			MenuComponent menu = it.next();
			menu.printMenuVegetariano();
		}
	}
}