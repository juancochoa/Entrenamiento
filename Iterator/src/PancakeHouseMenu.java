import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	private ArrayList<MenuItem> menuItems;
	private String descripcion;

	public PancakeHouseMenu() {
		descripcion="Comida para desayunar";
		menuItems = new ArrayList();
		addItem("Ket", "buen plato para el desayuno", false, 6800);
		addItem("Waffles", "buen plato para el desayuno", false, 9500);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}

	private void addItem(String nombre, String descripcion, boolean vegetariano, double precio) {
		MenuItem item = new MenuItem(nombre, descripcion, vegetariano, precio);
		menuItems.add(item);
	}
	@Override
	public String getDescripcion() {
		return descripcion;
	}
}