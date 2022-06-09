package ch03.HW;

import java.util.InputMismatchException;
import java.util.Scanner;

//4번
public class HW6 {
	public static void main(String[] args) {
		String[] day = { "일", "월", "화", "수", "목", "금", "토" };

		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("정수를 입력하세요>> ");
			try {
				int n = in.nextInt();
				if (n == -1) {
					System.out.println("프로그램 종료합니다...");
					break;
				}
				System.out.println(day[n%7]);
			} catch (InputMismatchException e) {
				System.out.println("경고! 숫자를 입력하지 않았습니다.");
				in.next();  //비워주기!@@@ 
			}
		}
		in.close();
	}
}
