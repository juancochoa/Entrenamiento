
public class SoldOutState implements State{
	private GumbalMachine gumbalMachine;

	public SoldOutState(GumbalMachine gumbalMachine) {
		this.gumbalMachine = gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there're not gumballs");
	}

	@Override
	public void dispense() {
		System.out.println("no gumball dispensed");
	}

}
