package ch03.Loop;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����ð�:  ");
		int time=in.nextInt();
		
		switch(time){
		case 7: System.out.println("���");
		case 8:System.out.println("���");
		case 9 : System.out.println("ȸ��");
		case 10:System.out.println("��������");
		case 11: System.out.println("����");
		case 12: System.out.println("��");
		}

	}

}
