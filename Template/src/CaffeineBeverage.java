
public abstract class CaffeineBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customersWantsCondiments()) {
			addCondiments();
		}
	}

	private void boilWater() {
		System.out.println("Boiling water");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	abstract void brew();

	abstract void addCondiments();

	public boolean customersWantsCondiments() {
		return true;
	}
}
