import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenu implements Menu {

	private MenuItem[] menuItems;
	private int posicion = 0;
	private String descripcion;

	public DinerMenu() {
		descripcion = "Comida para cenar";
		menuItems = new MenuItem[7];
		addItem("Carne BBQ", "buen plato para la comida", false, 10100);
		addItem("Alitas", "buen plato para la comida", false, 9500);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}

	private void addItem(String nombre, String descripcion, boolean vegetariano, double precio) {
		MenuItem item = new MenuItem(nombre, descripcion, vegetariano, precio);
		menuItems[posicion] = item;
		posicion++;
	}
	@Override
	public String getDescripcion() {
		return descripcion;
	}
}