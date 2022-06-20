package ch08;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() throws HeadlessException{
		setTitle("¿¹Á¦");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout(30,20));
		
		contentPane.add(new JButton("Calculator"),BorderLayout.CENTER);
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"),BorderLayout.EAST);
		contentPane.add(new JButton("div"),BorderLayout.WEST);
		
		setSize(300,400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
