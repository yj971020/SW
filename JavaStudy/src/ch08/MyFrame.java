package ch08;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() throws HeadlessException{
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
		
		//화면에 보이기
	}

}
