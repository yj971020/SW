package ch03.HW;

import java.util.InputMismatchException;
import java.util.Scanner;

//4��
public class HW6 {
	public static void main(String[] args) {
		String[] day = { "��", "��", "ȭ", "��", "��", "��", "��" };

		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("������ �Է��ϼ���>> ");
			try {
				int n = in.nextInt();
				if (n == -1) {
					System.out.println("���α׷� �����մϴ�...");
					break;
				}
				System.out.println(day[n%7]);
			} catch (InputMismatchException e) {
				System.out.println("���! ���ڸ� �Է����� �ʾҽ��ϴ�.");
				in.next();  //����ֱ�!@@@ 
			}
		}
		in.close();
	}
}
