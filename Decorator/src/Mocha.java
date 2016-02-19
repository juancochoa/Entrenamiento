
public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 1.2F;
	}

}
