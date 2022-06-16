package ch07.Homework;

import java.util.ArrayList;
import java.util.Comparator;
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

public class BookArrayList {
	static int size = 100;
	static int seq;

	static ArrayList<Book> bookArr = new ArrayList<>();
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
				bookSort();
				break;
			case 5:
				run = !run;
				break;
			}
		}
	}

	static int printMenu() {
		System.out.println("원하시는메뉴>");
		System.out.println("1.도서등록");
		System.out.println("2.도서찾기");
		System.out.println("3.도서리스트");
		System.out.println("4.도서 정렬");
		System.out.println("5.종료");
	
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
		for (int i = 0; i < bookArr.size(); i++) {
			if (bookArr.get(i) != null) {
				if (title.equals(bookArr.get(i).title) || author.equals(bookArr.get(i).author)) {
					find = new Book(bookArr.get(i).title, bookArr.get(i).author);
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
		bookArr.add(new Book(title, author));

	}

	static void listBook() {
		// 도서리스트 출력
		// 배열내의모든 book정보 출력
		for (int i = 0; i < bookArr.size(); i++) {
			if (bookArr.get(i) != null)
				System.out.println(bookArr.get(i).toString());
			else
				break;
		}
	}
	
	static void bookSort() {
		bookArr.sort(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.title.compareTo(o2.title);
			}
		});
	}
	
	
}
