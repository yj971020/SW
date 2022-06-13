package ch04.Homework02;

import java.util.Scanner;

public class WordGameApp {
	public static void main(String[] args) {
		run();
	}

	public static void run() {
		Scanner in = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
		int n = in.nextInt();
		Player[] p = new Player[n];

		for (int i = 0; i < n; i++) {
			System.out.print("참가자의 이름을 입력하세요>> ");
			String name=in.next();
			p[i]=new Player(name);
			
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		int i = 0;
		String word = "아버지";
		String word2="";
		while (true) {
			i = i % p.length;
			System.out.print(p[i].getName() + ">>");
			word2=p[i].getWordFromUser();
			
			if(!Player.checkSuccess(word, word2)) {
				System.out.println(p[i].getName()+" 이 졌습니다.");
				break;
			}
			word=word2;
			i++;
		}

	}

}
