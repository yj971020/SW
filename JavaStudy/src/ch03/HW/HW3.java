package ch03.HW;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("커피를 주문하세요>> ");
		String s=in.next();
		int num=in.nextInt();
		int price=0;
		int totalPrice=0;
		
		switch(s) {
		case "카푸치노":
			price=3000;
			break;
		case "에스프레소"	:
			price=2000;
			break;
		case "아메리카노":
			price=2500;
			break;
		case "카페라떼":
			price=3500;
			break;
		}
		totalPrice=num*price;
		if(num>=10) {
			totalPrice=(int) (totalPrice*0.95);
		}
		System.out.println(totalPrice+"원 입니다.");
		
		
	}

}
