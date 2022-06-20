package ch08;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() throws HeadlessException{
		setTitle("ContentPane과 Jframe 예제");
		Container contentPane= getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		
		JButton button1=new JButton("OK");
		JButton button2=new JButton("Cancel");
		JButton button3=new JButton("Ignore");
		
		//생성된 버튼들을 패널에 부착
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
		
	}
}
