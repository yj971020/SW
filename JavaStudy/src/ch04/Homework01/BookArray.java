package ch04.Homework01;

import java.util.Scanner;

class Book {
	String title, author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
}

public class BookArray {
	static int size = 100;
	static int seq;
	static Book[] bookArray = new Book[size]; // Book 배열 선언
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			int menu = printMenu();
			switch (menu) {
			case 1:
				registerBook();
				break;
			case 2:

				if (findBook() == null) {
					System.out.println("해당 책이 없습니다.");
				}
				;

				break;
			case 3:
				listBook();
				break;
			case 4:
				run = !run;
			}
		}
	}

	static int printMenu() {
		System.out.println("원하시는메뉴>");
		System.out.println("1.도서등록");
		System.out.println("2.도서찾기");
		System.out.println("3.도서리스트");
		System.out.println("4.종료");
		int menu = scanner.nextInt();
		scanner.nextLine();
		return menu;
	}

	static Book findBook() {
		// 도서제목으로 도서 찾기
		System.out.print("제목>>");
		String title = scanner.next();
		System.out.print("저자>>");
		String author = scanner.next();
		// 도서배열에서 제목이나 저자가 같은 도서가 있으면
		// 해당 도서를 생성하여 리턴 하고
		// 배열내에 제목이나 저자가 같은 도서가 없으면 null을 리턴.
		Book find = null;
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null) {
				if (title.equals(bookArray[i].title) || author.equals(bookArray[i].author)) {
					find = new Book(bookArray[i].title, bookArray[i].author);
					System.out.println(find.toString());
				}
			}
		}
		return find;
	}

	static void registerBook() {
		// 도서등록
		System.out.print("제목>>");
		String title = scanner.next();
		System.out.print("저자>>");
		String author = scanner.next();
		bookArray[seq++] = new Book(title, author);
	}

	static void listBook() {
		// 도서리스트 출력
		// 배열내의모든 book정보 출력
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null)
				System.out.println(bookArray[i].toString());
			else
				break;
		}
	}
}
