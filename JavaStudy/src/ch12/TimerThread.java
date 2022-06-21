package ch12;

import javax.swing.JLabel;

public class TimerThread extends Thread {
	int n = 0;
	private JLabel timerLabel;
	public TimerThread() {
		
	}
	public TimerThread(JLabel timerLabel) {
		this.timerLabel=timerLabel;
	}

	// ������ �ڵ� �ۼ�
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			//������ sleep �޼ҵ� ���� �ݵ�� try-catch ���!
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			if(n==9) break;  //n=15 �Ǹ� ����
		}
	}

}
