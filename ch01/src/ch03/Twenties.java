package ch03;

import java.util.Scanner;

public class Twenties {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.print("���̸� �Է��ϼ��� ");
	int age=s.nextInt();
	
	if(age>=20&&age<30) {
		System.out.println("20���Դϴ�");
	}
	else {
		System.out.println("20�밡 �ƴմϴ�!");
	}
	
	
}
}
