import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	ArrayList<Menu> menus;

	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public void printMenu() {

		Iterator<Menu> menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu=menuIterator.next();
			System.out.println(menu.getDescripcion());
			printMenu(menu.createIterator());
		}
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem item = iterator.next();
			System.out.print(item.getNombre() + " , ");
			System.out.print(item.getDescripcion() + " - ");
			System.out.println(item.getPrecio());
		}
	}
}
