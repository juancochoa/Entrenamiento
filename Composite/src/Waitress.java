
public class Waitress {
	private MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus=allMenus;
	}
	public void printMenu(){
		allMenus.print();
	}
	public void printMenuVegatariano(){
		allMenus.printMenuVegetariano();
	}
}
