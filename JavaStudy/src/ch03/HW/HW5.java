package ch03.HW;

import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String s= in.next();
		
		char c=s.charAt(0);
		
		for(int i=0;i<=c-'a';i++) {
			String answer="";
			for (int j='a'+i;j<=c;j++) {
				answer+=(char)j;
			}
			System.out.println(answer);
		}
		
		
		
	}

}
