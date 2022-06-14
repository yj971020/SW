package ch05.ch03_interface;

public class SamsungPhone extends Calc implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띠리링");
		
	}

	@Override
	public void recieveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
		
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
	public void schedule() {
		System.out.println("일정을 관리합니다.");
	}

}
