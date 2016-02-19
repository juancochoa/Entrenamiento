
public class DecoratorSimulator {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		beverage = new Milk(beverage);
		beverage = new Mocha(beverage);
		System.out.println(beverage.cost());
		System.out.println(beverage.getDescription());
	}
}
