
public class NoQuarterState implements State{
	private GumbalMachine gumbalMachine;

	public NoQuarterState(GumbalMachine gumbalMachine) {
		this.gumbalMachine = gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumbalMachine.setState(gumbalMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there's not a quarter");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}

}
