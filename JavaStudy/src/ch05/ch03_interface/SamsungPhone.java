package ch05.ch03_interface;

public class SamsungPhone extends Calc implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("�츮��");
		
	}

	@Override
	public void recieveCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �Խ��ϴ�.");
		
	}
	
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
	public void schedule() {
		System.out.println("������ �����մϴ�.");
	}

}
