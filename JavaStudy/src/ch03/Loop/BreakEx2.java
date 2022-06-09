package ch03.Loop;

import java.util.Scanner;

public class BreakEx2 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료");
		System.out.print("exit".hashCode()+"-");
		System.out.println(System.identityHashCode("exit"));
		while(true) {
			System.out.println(">>");
			String text=in.nextLine();
			System.out.println(text);
			System.out.print(text.hashCode()+"-");
			System.out.println(System.identityHashCode(text));
			if(text.equals("exit")) break;
		}
	}

}
