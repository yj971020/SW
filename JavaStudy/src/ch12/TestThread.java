package ch12;

public class TestThread {
	public static void main(String[] args) {
		//������ ��ü ����
		TimerThread th=new TimerThread();
		//������ ����  : th ��ü�� run �޼ҵ� ����
		//th.run();
		th.start();
		
		//������ ��ü �ϳ� �� ����
		TimerThread th1= new TimerThread();
		//th1.run(); //run ���� �ϸ� �̱� ������ �����.. �������� ������ ����
		th1.start();
	}

}
