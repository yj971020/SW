package ch02;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
		
		System.out.println("���������� ���� �Դϴ�. ���� ,���� , �� �߿��� �Է��ϼ��� ");
		System.out.print("ö��>> ");
		String s1=in.next();
		System.out.println("����>> ");
		String s2=in.next();
		String answer="";
		//���� ���� ��
		answer= (s1.equals(s2))?"�����ϴ�.":
			(s1.equals("����")&& s2.equals("����")?"���� �̰���ϴ�":"ö���� �̰���ϴ�.");
		answer=(s1.equals("����")&& s2.equals("����")?"���� �̰���ϴ�":"ö���� �̰���ϴ�.");
		answer=(s1.equals("����")&& s2.equals("����")?"���� �̰���ϴ�":"ö���� �̰���ϴ�.");
		
		System.out.println(answer);

	}

}
