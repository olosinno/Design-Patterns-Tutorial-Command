package dp.command;

public class TurnTVDown implements Command {
	ElectronicDevice theDevice;

	public TurnTVDown(ElectronicDevice newDevice) {theDevice = newDevice;}

	public void execute() {theDevice.volumeDown();}
	public void undo() {theDevice.volumeUp();}	
}
