package ch04.ch03_constructor;

public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title=t;
		author="���ڹ̻�";
	}
	
	public Book(String t,String a) {
		title=t;
		author=a;
	}
	public static void main(String[] args) {
		Book littlePrince=new Book("�����","�������丮");
		Book snowWhite=new Book("�鼳����");
		
		System.out.println(littlePrince.title);
		System.out.println(littlePrince.author);
		System.out.println(snowWhite.title);
		System.out.println(snowWhite.author);
		
	}

}
