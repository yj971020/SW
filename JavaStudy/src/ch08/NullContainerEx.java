package ch08;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("��ġ������ ���� ���� ��ġ�� ��ġ�ϴ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(null);//����Ʈ���� ��ġ������ ����
		
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
