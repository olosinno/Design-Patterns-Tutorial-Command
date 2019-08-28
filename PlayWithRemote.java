package dp.command;

public class PlayWithRemote {
	public static void main(String[] args) {
		ElectronicDevice newDevice = TVRemote.getDevice();
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();

		TurnTVUp upCommand = new TurnTVUp(newDevice);
		DeviceButton upPressed = new DeviceButton(upCommand);
		upPressed.press();
		upPressed.press();
		
		TurnTVDown downCommand = new TurnTVDown(newDevice);
		DeviceButton downPressed = new DeviceButton(downCommand);
		downPressed.press();
		downPressed.unpress();

		TurnTVOff offCommand = new TurnTVOff(newDevice);
		DeviceButton offPressed = new DeviceButton(offCommand);
		offPressed.press();
	}
}
