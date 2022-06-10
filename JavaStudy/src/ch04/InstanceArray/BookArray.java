package ch04.InstanceArray;

import java.util.Scanner;

class Book {
	String title, author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	
	static int size=100;
	static int seq;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Book[] book=new Book[seq];
		
		for(int i=0;i<book.length;i++) {
			System.out.print("제목>> ");
			String title=in.nextLine();
			System.out.print("저자>> ");
			String author=in.nextLine();
			book[i]=new Book(title,author);
		}
			for(int i=0;i<book.length;i++)
				System.out.println("("+book[i].title+","+book[i].author+")");
			
			in.close();
		}
	
	
	}
