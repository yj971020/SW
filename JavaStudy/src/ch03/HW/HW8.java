package ch03.HW;

import java.util.Scanner;

//6��
public class HW8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] eng = { "student", "love", "java", "happy", "future" };
		String[] kor = { "�л�", "���", "�ڹ�", "�ູ��", "�̷�" };

		while (true) {
			System.out.print("���� �ܾ �Է��ϼ��� >> ");
			String str = in.next();
			if (str.equals("exit")) {
				System.out.println("�����մϴ�...");
				in.close();
				break;
			}
			for (int i = 0; i < eng.length; i++) {
				if (str.equals(eng[i])) {
					System.out.println(kor[i]);
					break;
				}
					if (i == (eng.length - 1)) {
						System.out.println("�׷� ���� �ܾ �����ϴ�.");
					}
				}

			}
		}
	}

