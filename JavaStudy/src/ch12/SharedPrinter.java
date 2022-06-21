package ch12;

//�� WorkerThread �����忡 ���� ���� ���ٵǴ� ���� ������
class SharedPrinter {
//synchronized�� �����ϸ�
//�ѱ۰� ��� �� �ٿ� ���� ��µǴ� ��찡 �߻��Ѵ�.
	 synchronized void print(String text) {
//Thread.yield();
		for (int i = 0; i < text.length(); i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
}

//������ Ŭ����
class WorkerThread extends Thread {
	//�����忡�� ����ϰ��� �ϴ� ��ü Ÿ������ ��js
	private SharedPrinter p; // ���� ������ �ּ�
	private String[] text;

	public WorkerThread(SharedPrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}

//������� �ݺ������� ���� �����Ϳ� 10�� ���� text[] ���
	@Override
	public void run() {
		for (int i = 0; i < text.length; i++) // �� �پ� ���
			p.print(text[i]); // ���� �����Ϳ� ���
	}
}