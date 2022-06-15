package ch06;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);	
		String a="a";
		String b="a";
		
		String c= new String("a");
		System.out.println(a==b);
		System.out.println(a==c);
		String d=in.next(); //a ют╥б

		System.out.println(a==d);
		a="b";
		System.out.println(a==b);
		a="a";
		
		System.out.println(a==b);
		
	}

}
