
public class CompositeSimulator {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu=new Menu("pancake","son buenos pal desayuno");
		MenuComponent dinerMenu=new Menu("diner","son buenos pa la comida");
		MenuComponent cafeMenu=new Menu("cafe","por la noche los mejores");
		MenuComponent dessertMenu=new Menu("dessert","esto es un sub");
		MenuComponent allMenus=new Menu("All menus","Todos los menus combinados");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		pancakeHouseMenu.add(new MenuItem("wafflets", "ricos pal desayuno", 4900, true));
		dinerMenu.add(new MenuItem("carne BBQ", "jugosa carne", 10100, false));
		cafeMenu.add(new MenuItem("cafe helado", "antes de ir a dormir", 8450, true));
		dinerMenu.add(dessertMenu);
		Waitress waitress=new Waitress(allMenus);
		//waitress.printMenu();
		waitress.printMenuVegatariano();
	}
}
