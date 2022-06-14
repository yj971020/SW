package ch05.Homework;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" **Bear�� fish �� �Ա� ������ �����մϴ�.**");
		char[][] board = new char[10][20];
		// ������ �� '-' �� �ʱ�ȭ
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				board[i][j] = '-';
			}
		}
		Bear b = new Bear(0, 0, 1); // �ʱ� ��ǥ (0,0)
		// ����� �ʱ� �� 0,0 ���� ��Ű��
		// 1~19, 1~9 �ε��� �ȿ��� ���� ����
		Fish f = new Fish((int) (Math.random() * 9) + 1, (int) (Math.random() * 19) + 1, 1);

		// ���� ����� ���忡 �־��� (�ʱ�)
		board[b.getX()][b.getY()] = b.getShape();
		board[f.getX()][f.getY()] = f.getShape();
		printBoard(board);

		while(true) {
			board[b.getX()][b.getY()] = '-';
			board[f.getX()][f.getY()] = '-';
			b.move();
			f.move();
			board[b.getX()][b.getY()] = b.getShape();
			board[f.getX()][f.getY()] = f.getShape();
			if((b.getX()==f.getX())&&(b.getY()==f.getY())) {
				board[b.getX()][b.getY()] = b.getShape();
				printBoard(board);
				System.out.print("Bear �� �̰���ϴ�!");
				break;
			}
			printBoard(board);
		}
	}
	
	//board ��� 
	static void printBoard(char[][] board) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}
