package ch13.Homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Hangman {
	public static void main(String[] args) {
		Vector<String> wordVector = new Vector<String>();
		try {
			// 한라인에 하나의 영어 단어 존재, Scanner 이용
			Scanner in = new Scanner(new FileReader("c:\\temp\\words.txt"));
			while (in.hasNext()) { // 파일의 끝까지 반복하여 읽는다.
				String word = in.nextLine(); // 한 라인 단위로 읽는다.
				wordVector.add(word); // 단어를 벡터에 저장한다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner scan = new Scanner(System.in); // 사용자로부터 입력받을 스캐너

		while (true) {
			int idx = (int) (Math.random() * wordVector.size());
			String answer = (String) wordVector.get(idx); // 랜덤 단어 선택 ( 정답 단어)

			int ran1idx = (int) (Math.random() * answer.length()); // 단어의 어느 부분 가릴까 1
			int ran2idx = 0;
			// 가릴 위치 2개가 겹치면 안됨 -> 서로 다른 랜덤 수 나올 때 까지 반복
			do {
				ran2idx = (int) (Math.random() * answer.length()); // 2
			} while (ran1idx == ran2idx);

			System.out.println(ran2idx + " " + ran1idx);
			String[] ss = answer.split("");
			// 감출 문자열 저장
			String s1 = ss[ran1idx];
			String s2 = ss[ran2idx];

			ss[ran1idx] = "-";
			ss[ran2idx] = "-";
			String word = ""; // 게임 진행 위한 가려진 단어
			for (String w : ss) {
				word += w;
			}

			int count = 0;// 틀린 횟수
			int countHidden = 2; // 현재 가려진 단어 수
			System.out.println("행맨 start!");
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
				System.out.println("5번 실패 하였습니다");
				System.out.println(answer); //정답
			}
		
			System.out.print("Next(y/n)? ");
			String nextgame = scan.next();
			if (nextgame.equals("y"))
				continue;
			else if (nextgame.equals("n")) {
				System.out.println("행맨게임을 종료합니다.");
				break;
			}else {
				System.out.println("잘못입력. 종료");
				break;
			}

		}

	}
};