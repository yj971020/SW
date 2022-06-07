package ch02;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner in = new Scanner ( System.in);
		
		System.out.println("가위바위보 게임 입니다. 가위 ,바위 , 보 중에서 입력하세요 ");
		System.out.print("철수>> ");
		String s1=in.next();
		System.out.println("영희>> ");
		String s2=in.next();
		String answer="";
		//가위 바위 보
		answer= (s1.equals(s2))?"비겼습니다.":
			(s1.equals("가위")&& s2.equals("바위")?"영희가 이겼습니다":"철수가 이겼습니다.");
		answer=(s1.equals("바위")&& s2.equals("바위")?"영희가 이겼습니다":"철수가 이겼습니다.");
		answer=(s1.equals("가위")&& s2.equals("바위")?"영희가 이겼습니다":"철수가 이겼습니다.");
		
		System.out.println(answer);

	}

}
