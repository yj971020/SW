package ch03.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0, n = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">> ");
			
			try { // 예외가 발생할 수 있는 코드
				n = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요");
				in.next(); // 정수가 아닌 토큰을 스트림에서 빼준다!!!!!
				i--; // 인덱스 증가하지 않도록 미리 감소
			}
			sum += n;
		}
		System.out.println("합은" + sum);
		in.close();
	}
}
