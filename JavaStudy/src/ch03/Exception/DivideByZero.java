package ch03.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in);
				System.out.println("정수 3개를 입력하세요");
				int sum=0,n=0;
				for(int i=0;i<3;i++) 
				
				try {  //예외가 발생할 수 있는 코드
					
				
				
				
				//어떤 오류가 나올지 예상, ( or 조건은 || 아닌 | 로)
				}catch(ArithmeticException|InputMismatchException e) {  					System.out.println("에러발생"+e.toString());
					
				}catch(Exception e) { //어떤 오류일지 모르니 일단 Exception 으로 
					System.out.println("에러발생"+e.toString());
				}finally {
					System.out.println("에러발생");
					in.close();
				}
	}

}
