package ch03.Loop;

import java.util.Scanner;

public class ContinueEx {
	public static void main(String[] args) {
		//5���� ������ �Է¹ް� ����� �ո� ���
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� 5���� �Է����ּ���");
		int sum=0;
		
		for(int i=0;i<5;i++) {
			int n=in.nextInt();
			if (n<0) continue;
			sum+=n;
		}
		System.out.println(sum);
	}
}
