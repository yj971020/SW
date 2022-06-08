package ch03;

import java.util.Scanner;

public class BreakEx {
	public static void main(String[] args) {	
		Scanner in= new Scanner(System.in);
		System.out.println("exit 를 입력하면 종료");
		while(true) {
		String text=in.nextLine();
		if (text.equals("exit")) break;
		
		}
		System.out.println("종료");
		in.close();
	}
}
