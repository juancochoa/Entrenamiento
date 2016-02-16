public class CommandSimulator {
	public static void main(String[] args) {
		Light light = new Light();
		Stereo stereo=new Stereo();
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		StereoOnCommand stereoOnCommand=new StereoOnCommand(stereo);
		StereoOffCommand stereoOffCommand=new StereoOffCommand(stereo);
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.OnBotonPresionado(0);
		remoteControl.OffBotonPresionado(0);
		System.out.println(remoteControl);
		remoteControl.UndoBotonPresionado();
		remoteControl.OnBotonPresionado(0);
		remoteControl.UndoBotonPresionado();
		Command[] partyOn={lightOnCommand, stereoOnCommand};
		Command[] partyOff={lightOffCommand,stereoOffCommand};
		MacroCommand macroOn=new MacroCommand(partyOn);
		MacroCommand macroOff=new MacroCommand(partyOff);
		remoteControl.setCommand(1, macroOn, macroOff);
		System.out.println(remoteControl);
		remoteControl.OnBotonPresionado(1);
		remoteControl.OffBotonPresionado(1);
		remoteControl.UndoBotonPresionado();
	}
}
