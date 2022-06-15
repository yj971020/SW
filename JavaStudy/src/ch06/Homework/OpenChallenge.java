package ch06.Homework;

import java.util.Scanner;
import java.util.StringTokenizer;

public class OpenChallenge {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(readString(), "");
		int[] arr = new int[27];
		String s = st.nextToken().toUpperCase();
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && (s.charAt(i) - 65)>=0) {
				arr[s.charAt(i) - 65] += 1;
			}
		}
		/*
		 * System.out.println((int)'A'); //65 System.out.println((int)'Z'); //90
		 * System.out.println((int)'a'); //97 System.out.println((int)'z'); //122
		 */
		for (int i = 0; i < arr.length; i++) {
			System.out.print((char) (i + 65) + "("+arr[i]+")");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	static String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner in = new Scanner(System.in);
		while (true) {
			String line = in.nextLine();
			if (line.equals(";")) {
				break;
			}
			sb.append(line);
		}
		return sb.toString();
	}
}
