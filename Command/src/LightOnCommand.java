public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		this.light.On();
	}

	public void undo() {
		this.light.Off();
	}

}
