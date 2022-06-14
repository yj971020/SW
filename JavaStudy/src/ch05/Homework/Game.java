package ch05.Homework;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" **Bear과 fish 의 먹기 게임을 시작합니다.**");
		char[][] board = new char[10][20];
		// 보드의 값 '-' 로 초기화
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				board[i][j] = '-';
			}
		}
		Bear b = new Bear(0, 0, 1); // 초기 좌표 (0,0)
		// 물고기 초기 값 0,0 제외 시키고
		// 1~19, 1~9 인덱스 안에서 랜덤 배정
		Fish f = new Fish((int) (Math.random() * 9) + 1, (int) (Math.random() * 19) + 1, 1);

		// 곰과 물고기 보드에 넣어줌 (초기)
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
				System.out.print("Bear 가 이겼습니다!");
				break;
			}
			printBoard(board);
		}
	}
	
	//board 출력 
	static void printBoard(char[][] board) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
}
