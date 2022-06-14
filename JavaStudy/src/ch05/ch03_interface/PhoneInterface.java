package ch05.ch03_interface;

public interface PhoneInterface {
	/*
	 * ��� ������ ���� �Ұ�, ����� ���� 
	 * static final int TIMEOUT=10000; 
	 * �������̽��� ��� Ŭ������ ��밡���ϱ� ������ �ۺ� ��
	 */
	int TIMEOUT = 10000;
	// public static final �� ������ - �������̽� ����
	// ���-�߻�޼ҵ�

	// public abstract void sendCall();
	// public abstract ������
	void sendCall();

	// public abstract void recieveCall();
	// public abstract ������
	void recieveCall();

	/*
	 * ������ �������̽����� �޼ҵ� ���� �Ұ� default Ű���� ����Ͽ� �޼ҵ� ���� ���� (java 8) static, private
	 * �޼ҵ�� ��� ���� (java 9)
	 */
	public default void printLogo() {
		System.out.println("**phone**");
	}
	
	static void pirntvoid() {
		System.out.println("printvoid");
	}

}
class Calc{
	public int calculate(int x,int y) {
		return x+y;
	}
}
