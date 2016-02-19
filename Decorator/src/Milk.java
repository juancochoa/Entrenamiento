
public class Milk extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+" Milk";
	}

	@Override
	public float cost() {
		return this.beverage.cost()+2.1F;
	}

}
