package ch02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		//resource ���
		Scanner in = new Scanner(System.in);

		String name = in.next();
		System.out.println("����� �̸��� " + name);

		String city = in.next();
		System.out.println("����� ���ô� "+city);
		
		int age=in.nextInt();
		System.out.println("����� ���̴� "+age);
		
		double weight=in.nextDouble();
		System.out.println("����� �����Դ�"+ weight);
		
		boolean single =in.nextBoolean();
		System.out.println("����� ���ſ��δ� "+single);
		
		in.close(); //resource ����
	}

}
