package day6.usingfinal.Interface.extendinginterfaces;

public class Jio implements Phone{
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");

	}

}
