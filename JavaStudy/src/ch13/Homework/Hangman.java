package ch13.Homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Hangman {
	public static void main(String[] args) {
		Vector<String> wordVector = new Vector<String>();
		try {
			// �Ѷ��ο� �ϳ��� ���� �ܾ� ����, Scanner �̿�
			Scanner in = new Scanner(new FileReader("c:\\temp\\words.txt"));
			while (in.hasNext()) { // ������ ������ �ݺ��Ͽ� �д´�.
				String word = in.nextLine(); // �� ���� ������ �д´�.
				wordVector.add(word); // �ܾ ���Ϳ� �����Ѵ�.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner scan = new Scanner(System.in); // ����ڷκ��� �Է¹��� ��ĳ��

		while (true) {
			int idx = (int) (Math.random() * wordVector.size());
			String answer = (String) wordVector.get(idx); // ���� �ܾ� ���� ( ���� �ܾ�)

			int ran1idx = (int) (Math.random() * answer.length()); // �ܾ��� ��� �κ� ������ 1
			int ran2idx = 0;
			// ���� ��ġ 2���� ��ġ�� �ȵ� -> ���� �ٸ� ���� �� ���� �� ���� �ݺ�
			do {
				ran2idx = (int) (Math.random() * answer.length()); // 2
			} while (ran1idx == ran2idx);

			System.out.println(ran2idx + " " + ran1idx);
			String[] ss = answer.split("");
			// ���� ���ڿ� ����
			String s1 = ss[ran1idx];
			String s2 = ss[ran2idx];

			ss[ran1idx] = "-";
			ss[ran2idx] = "-";
			String word = ""; // ���� ���� ���� ������ �ܾ�
			for (String w : ss) {
				word += w;
			}

			int count = 0;// Ʋ�� Ƚ��
			int countHidden = 2; // ���� ������ �ܾ� ��
			System.out.println("��� start!");
			while (count < 5 && countHidden > 0) {
				System.out.println(word);
				System.out.print(">> ");
				String inputs = scan.next();

				if (inputs.equals(s1)) {
					ss[ran1idx] = s1;
					countHidden--;
				} else if (inputs.equals(s2)) {
					ss[ran2idx] = s2;
					countHidden--;
				} else {
					count++;
					continue;
				}
				word = "";
				for (String w : ss) {
					word += w;
				}
			}
			if (count == 5) {
				System.out.println("5�� ���� �Ͽ����ϴ�");
				System.out.println(answer); //����
			}
		
			System.out.print("Next(y/n)? ");
			String nextgame = scan.next();
			if (nextgame.equals("y"))
				continue;
			else if (nextgame.equals("n")) {
				System.out.println("��ǰ����� �����մϴ�.");
				break;
			}else {
				System.out.println("�߸��Է�. ����");
				break;
			}

		}

	}
};