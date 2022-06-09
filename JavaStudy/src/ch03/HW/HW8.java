package ch03.HW;

import java.util.Scanner;

//6번
public class HW8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] eng = { "student", "love", "java", "happy", "future" };
		String[] kor = { "학생", "사랑", "자바", "행복한", "미래" };

		while (true) {
			System.out.print("영어 단어를 입력하세요 >> ");
			String str = in.next();
			if (str.equals("exit")) {
				System.out.println("종료합니다...");
				in.close();
				break;
			}
			for (int i = 0; i < eng.length; i++) {
				if (str.equals(eng[i])) {
					System.out.println(kor[i]);
					break;
				}
					if (i == (eng.length - 1)) {
						System.out.println("그런 영어 단어가 없습니다.");
					}
				}

			}
		}
	}

