package ch08;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() throws HeadlessException{
		setTitle("300x300 ���� ������ �����");
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
		
		//ȭ�鿡 ���̱�
	}

}
