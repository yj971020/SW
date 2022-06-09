package ch03.Loop;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("현재시각:  ");
		int time=in.nextInt();
		
		switch(time){
		case 7: System.out.println("기상");
		case 8:System.out.println("출근");
		case 9 : System.out.println("회의");
		case 10:System.out.println("오전업무");
		case 11: System.out.println("출장");
		case 12: System.out.println("밥");
		}

	}

}
