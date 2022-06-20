package ch08;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(null);//컨텐트팬의 배치관리자 제거
		
		JLabel la = new JLabel("Hello,Press Buttons");
		la.setLocation(130, 50);
		la.setSize(200,20);
		contentPane.add(la);
		
		for ( int i=1;i<=9;i++) {
			JButton b= new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			
		}
	}


}
