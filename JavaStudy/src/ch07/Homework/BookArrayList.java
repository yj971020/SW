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
					System.out.println("�ش� å�� �����ϴ�.");
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
		System.out.println("���Ͻô¸޴�>");
		System.out.println("1.�������");
		System.out.println("2.����ã��");
		System.out.println("3.��������Ʈ");
		System.out.println("4.���� ����");
		System.out.println("5.����");
	
		int menu = scanner.nextInt();
		scanner.nextLine();
		return menu;
	}

	static Book findBook() {
		// ������������ ���� ã��
		System.out.print("����>>");
		String title = scanner.next();
		System.out.print("����>>");
		String author = scanner.next();
		// �����迭���� �����̳� ���ڰ� ���� ������ ������
		// �ش� ������ �����Ͽ� ���� �ϰ�
		// �迭���� �����̳� ���ڰ� ���� ������ ������ null�� ����.
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
		// �������
		System.out.print("����>>");
		String title = scanner.next();
		System.out.print("����>>");
		String author = scanner.next();
		bookArr.add(new Book(title, author));

	}

	static void listBook() {
		// ��������Ʈ ���
		// �迭���Ǹ�� book���� ���
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
