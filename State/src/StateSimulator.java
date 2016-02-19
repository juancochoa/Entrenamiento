
public class StateSimulator {
	public static void main(String[] args) {
		GumbalMachine gumbalMachine=new GumbalMachine(5);
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank();
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank();
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank();
	}
}
