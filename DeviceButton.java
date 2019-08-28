package dp.command;

public class DeviceButton {
	Command theCommand;
	public DeviceButton(Command newCommand) {theCommand = newCommand;}
	
	public void press() {
		theCommand.execute();
	}
	public void unpress() {theCommand.undo();}
}
