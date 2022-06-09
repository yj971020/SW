package ch03.Loop;

import java.util.Scanner;

public class WhileEx {
	//정수의 평균 출력 ( while 문 사용)
	// 0 이 입력되면 입력 종료
	
	public static void main(String[] args) {
		System.out.print("정수를 입력하고 마지막에 0 입력하세요");
		Scanner in = new Scanner(System.in);
		
		int count=0,n=0;
		int sum=0;
		
		while((n=in.nextInt())!=0) {
			sum+=n;
			count++;
		}
		System.out.println("avg= "+ (double)sum/count);
	}
}
