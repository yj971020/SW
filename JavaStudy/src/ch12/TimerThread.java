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

	// 스레드 코드 작성
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			//스레드 sleep 메소드 사용시 반드시 try-catch 사용!
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			if(n==9) break;  //n=15 되면 종료
		}
	}

}
