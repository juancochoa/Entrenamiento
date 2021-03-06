
public class HasQuarterState implements State {
	private GumbalMachine gumbalMachine;

	public HasQuarterState(GumbalMachine gumbalMachine) {
		this.gumbalMachine = gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("no se pueden insertar dos monedas");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumbalMachine.setState(gumbalMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		gumbalMachine.setState(gumbalMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispensed");
	}

}
