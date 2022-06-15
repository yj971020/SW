package ch06.Homework;

import java.util.Scanner;

public class StringRotateOnEnter {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈 칸이나 영어 한글 모두 가능");
		String s=in.nextLine();
		System.out.println("<Enter> 를 입력하면 문자열이 한 글자씩 회전합니다.");
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
		System.out.println("종료합니다.");
		in.close();
	}

}
