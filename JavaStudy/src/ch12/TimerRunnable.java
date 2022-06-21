package ch12;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;

	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

// ������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n = 0; // Ÿ�̸� ī��Ʈ ��
		while (true) { // ���� ����
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); // 1�ʵ��� ���� �ܴ�.
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
