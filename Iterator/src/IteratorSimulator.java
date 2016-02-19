import java.util.ArrayList;

public class IteratorSimulator {
	public static void main(String[] args) {
		DinerMenu dinerMenu = new DinerMenu();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		ArrayList<Menu> menus = new ArrayList();
		menus.add(dinerMenu);
		menus.add(pancakeHouseMenu);
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}
