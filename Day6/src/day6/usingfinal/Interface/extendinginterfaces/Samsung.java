package day6.usingfinal.Interface.extendinginterfaces;

public class Samsung implements Phone{
	public void call() {
		System.out.println("Calling using Samsung");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Samsung");

	}

}
