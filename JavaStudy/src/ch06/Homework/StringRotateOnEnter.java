package ch06.Homework;

import java.util.Scanner;

public class StringRotateOnEnter {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. �� ĭ�̳� ���� �ѱ� ��� ����");
		String s=in.nextLine();
		System.out.println("<Enter> �� �Է��ϸ� ���ڿ��� �� ���ھ� ȸ���մϴ�.");
		while(true) {
			String key=in.nextLine();
			if(key.equals("")) {
				String first=Character.toString(s.charAt(0));
				String last=s.substring(1);
				s=last+first;
				System.out.print(s+">>");
				
			}
			else if(key.equals("q")) 
				break;
			else
				System.out.println(s+" >>");
			
		}
		System.out.println("�����մϴ�.");
		in.close();
	}

}
