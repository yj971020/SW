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
	static Book[] bookArray = new Book[size]; // Book �迭 ����
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
				run = !run;
			}
		}
	}

	static int printMenu() {
		System.out.println("���Ͻô¸޴�>");
		System.out.println("1.�������");
		System.out.println("2.����ã��");
		System.out.println("3.��������Ʈ");
		System.out.println("4.����");
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
		// �������
		System.out.print("����>>");
		String title = scanner.next();
		System.out.print("����>>");
		String author = scanner.next();
		bookArray[seq++] = new Book(title, author);
	}

	static void listBook() {
		// ��������Ʈ ���
		// �迭���Ǹ�� book���� ���
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null)
				System.out.println(bookArray[i].toString());
			else
				break;
		}
	}
}
