package ch05.ch03_interface;

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone= new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.recieveCall();
		phone.flash();
	}

}
