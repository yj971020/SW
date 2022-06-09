package ch03.Loop;

import java.util.Scanner;

public class ContinueEx {
	public static void main(String[] args) {
		//5개의 정수를 입력받고 양수의 합만 계산
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력해주세요");
		int sum=0;
		
		for(int i=0;i<5;i++) {
			int n=in.nextInt();
			if (n<0) continue;
			sum+=n;
		}
		System.out.println(sum);
	}
}
