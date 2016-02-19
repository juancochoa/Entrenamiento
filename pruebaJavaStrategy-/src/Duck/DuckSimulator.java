package Duck;

import QuackBehavior.MuteQuack;

public class DuckSimulator {
	public static void main(String[] args) {
		System.out.println("oe");
		Duck mallard=new MallarDuck();
		mallard.perfomFly();
		mallard.perfomQuack();
		mallard.setQuackBehavior(new MuteQuack());
		mallard.perfomQuack();
	}
}
