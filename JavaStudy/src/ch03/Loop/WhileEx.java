package ch03.Loop;

import java.util.Scanner;

public class WhileEx {
	//������ ��� ��� ( while �� ���)
	// 0 �� �ԷµǸ� �Է� ����
	
	public static void main(String[] args) {
		System.out.print("������ �Է��ϰ� �������� 0 �Է��ϼ���");
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
