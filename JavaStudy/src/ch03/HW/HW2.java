package ch03.HW;

import java.util.Scanner;

public class HW2 {
	// 9��
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��ϼ���>> ");
		int num = in.nextInt();
		int[] numarr = { 3, 6, 9 };
		int count = 0;
		String answer = "";
		if (num > 99 || num < 1) {
			System.out.print("�߸��Է�");
		} else {
			int first = num / 10;
			int second = num % 10;

			for (int i = 0; i < 3; i++) {
				if (first == numarr[i])
					count++;
				if (second == numarr[i]) {
					count++;
				}
			}
		}

		if (count == 0) {
			answer = "����";
		} else {
			for (int i = 0; i < count; i++) {
				answer += "¦";
			}
		}
		System.out.println("�ڼ�" + answer);

	}
}
