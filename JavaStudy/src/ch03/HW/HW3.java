package ch03.HW;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("Ŀ�Ǹ� �ֹ��ϼ���>> ");
		String s=in.next();
		int num=in.nextInt();
		int price=0;
		int totalPrice=0;
		
		switch(s) {
		case "īǪġ��":
			price=3000;
			break;
		case "����������"	:
			price=2000;
			break;
		case "�Ƹ޸�ī��":
			price=2500;
			break;
		case "ī���":
			price=3500;
			break;
		}
		totalPrice=num*price;
		if(num>=10) {
			totalPrice=(int) (totalPrice*0.95);
		}
		System.out.println(totalPrice+"�� �Դϴ�.");
		
		
	}

}
