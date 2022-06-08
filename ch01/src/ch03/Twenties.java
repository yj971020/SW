package ch03;

import java.util.Scanner;

public class Twenties {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.print("나이를 입력하세요 ");
	int age=s.nextInt();
	
	if(age>=20&&age<30) {
		System.out.println("20대입니다");
	}
	else {
		System.out.println("20대가 아닙니다!");
	}
	
	
}
}
