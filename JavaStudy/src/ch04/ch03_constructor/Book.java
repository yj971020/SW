package ch04.ch03_constructor;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title=t;
		author="작자미상";
	}
	
	public Book(String t,String a) {
		title=t;
		author=a;
	}
	public static void main(String[] args) {
		Book littlePrince=new Book("어린왕자","생택쥐페리");
		Book snowWhite=new Book("백설공주");
		
		System.out.println(littlePrince.title);
		System.out.println(littlePrince.author);
		System.out.println(snowWhite.title);
		System.out.println(snowWhite.author);
		
	}

}
