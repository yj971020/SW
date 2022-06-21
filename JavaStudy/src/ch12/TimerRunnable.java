package ch12;

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;

	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

// 스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		int n = 0; // 타이머 카운트 값
		while (true) { // 무한 루프
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); // 1초동안 잠을 잔다.
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}
