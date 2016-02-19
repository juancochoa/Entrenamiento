public class RemoteControl {
	private Command[] CommandosOn;
	private Command[] CommandosOff;
	private Command comandoAnterior;

	public RemoteControl() {
		CommandosOn = new Command[7];
		CommandosOff = new Command[7];
		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			this.CommandosOn[i] = noCommand;
			this.CommandosOff[i] = noCommand;
		}
		comandoAnterior = noCommand;
	}

	public void setCommand(int slot, Command commandoOn, Command commandoOff) {
		this.CommandosOn[slot] = commandoOn;
		this.CommandosOff[slot] = commandoOff;
	}

	public void OnBotonPresionado(int slot) {
		this.CommandosOn[slot].execute();
		comandoAnterior = CommandosOn[slot];
	}

	public void OffBotonPresionado(int slot) {
		this.CommandosOff[slot].execute();
		comandoAnterior = CommandosOff[slot];
	}

	public void UndoBotonPresionado(){
		comandoAnterior.undo();
	}
	public String toString() {
		StringBuffer comandos = new StringBuffer();
		comandos.append("---- Remote Control ----\n");
		for (int i = 0; i < 7; i++) {
			comandos.append("slot " + i + " "
					+ CommandosOn[i].getClass().getName() + " "
					+ CommandosOff[i].getClass().getName() + " ");
		}
		return comandos.toString();
	}

}