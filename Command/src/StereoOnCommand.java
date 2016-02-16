
public class StereoOnCommand implements Command {

	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.On();
	}

	public void undo() {
		stereo.Off();
	}

}
