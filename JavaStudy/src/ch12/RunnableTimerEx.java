package ch12;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerEx extends JFrame {
public RunnableTimerEx() {
setTitle("Runnable을 구현한 타이머 스레드 예제");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c = getContentPane();
c.setLayout(new FlowLayout());
// 타이머 값을 출력할 레이블 생성
JLabel timerLabel = new JLabel();
timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
c.add(timerLabel); // 레이블을 컨텐트팬에 부착
TimerRunnable runnable = new TimerRunnable(timerLabel);
Thread th = new Thread(runnable); // 스레드 객체 생성
setSize(250,150);
setVisible(true);
th.start(); // 타이머 스레드가 실행을 시작하게 한다.
}
public static void main(String[] args) {
new RunnableTimerEx();
}
}