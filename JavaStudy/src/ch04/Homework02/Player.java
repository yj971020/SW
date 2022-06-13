package ch04.Homework02;

import java.util.Scanner;

public class Player {
	private String name;
	private String word;
	private Boolean check;
	
	Player(String name){
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public String getWordFromUser() {
		Scanner in = new Scanner(System.in);
		this.word=in.next();
		return this.word;
	}

	public static Boolean checkSuccess(String word,String word2) {
		int lastIndex=word.length();
		char lastChar=word.charAt(lastIndex-1);
		char firstChar= word2.charAt(0);
		if (lastChar==firstChar) {
			return true;
		}
		return false;
	}
}
