package ch12;

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter(); // ���� ������ ����
		String [] engText = { "Wise men say, ",
		"only fools rush in",
		"But I can't help, ",
		"falling in love with you",
		"Shall I stay? ",
		"Would it be a sin?",
		"If I can't help, ",
		"falling in love with you" };
		String [] korText = { "���ع��� ��λ��� ������ �⵵��, ",
		"�ϴ����� �����ϻ� �츮 ���� ����",
		"����ȭ ��õ�� ȭ������, ",
		"���� ��� �������� ���� �����ϼ�",
		"���� ���� �� �ҳ���, ö���� �θ� ��",
		"�ٶ����� �Һ����� �츮 ����ϼ�.",
		"����ȭ ��õ�� ȭ������, ",
		"���� ��� �������� ���� �����ϼ�" };
		Thread th1 = new WorkerThread(p, engText);//������½�����
		Thread th2 = new WorkerThread(p, korText);//������½�����
		// �� �����带 �����Ų��.
		th1.start();
		th2.start();
		}


}
