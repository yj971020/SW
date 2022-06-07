package ch02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		//resource 사용
		Scanner in = new Scanner(System.in);

		String name = in.next();
		System.out.println("당신의 이름은 " + name);

		String city = in.next();
		System.out.println("당신의 도시는 "+city);
		
		int age=in.nextInt();
		System.out.println("당신의 나이는 "+age);
		
		double weight=in.nextDouble();
		System.out.println("당신의 몸무게는"+ weight);
		
		boolean single =in.nextBoolean();
		System.out.println("당신의 독신여부는 "+single);
		
		in.close(); //resource 해제
	}

}
