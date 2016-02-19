package Duck;
import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class MallarDuck extends Duck {
	public MallarDuck() {
		// TODO Auto-generated constructor stub
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyWithWings());
	}
}
