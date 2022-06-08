package ch03.HW;

import java.util.Scanner;

public class HW1 {
	//6번 80p
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>> ");
		int p=in.nextInt();
		int[] money= {50000,10000,1000,500,100,10,1};
		int count=0;
		for( int i=0;i<money.length;i++) {
			count=p/money[i];
			System.out.print(money[i]+"권 "+count+"개, ");
			p%=money[i];
		}
	}

}
