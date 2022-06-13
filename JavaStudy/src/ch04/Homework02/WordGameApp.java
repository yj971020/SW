package ch04.Homework02;

import java.util.Scanner;

public class WordGameApp {
	public static void main(String[] args) {
		run();
	}

	public static void run() {
		Scanner in = new Scanner(System.in);
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>> ");
		int n = in.nextInt();
		Player[] p = new Player[n];

		for (int i = 0; i < n; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>> ");
			String name=in.next();
			p[i]=new Player(name);
			
		}
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
		int i = 0;
		String word = "�ƹ���";
		String word2="";
		while (true) {
			i = i % p.length;
			System.out.print(p[i].getName() + ">>");
			word2=p[i].getWordFromUser();
			
			if(!Player.checkSuccess(word, word2)) {
				System.out.println(p[i].getName()+" �� �����ϴ�.");
				break;
			}
			word=word2;
			i++;
		}

	}

}
