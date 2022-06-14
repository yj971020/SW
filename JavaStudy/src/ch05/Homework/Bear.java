package ch05.Homework;

import java.util.Scanner;

public class Bear extends GameObject {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);

	}

	@Override
	protected void move() {
		Scanner in = new Scanner(System.in);
		System.out.print(" 왼 (a) 오(f) 위(d) 아래(s) 중 한가지를 입력하세요");
		String move = in.next();
		switch (move) {
			case "d": // 위
				x--;
				if (x < 0)
				x = (10 + x);
				break;
				
			case "s": // 아래
				x = (x + 1) % 10;
				break;
				
			case "a": // 왼
				y = y - 1;
				if (y < 0)
					y = 19;
				break;
				
			case "f": //오
				y = (y + 1) % 20; 
				break;
		}
	}

	@Override
	protected char getShape() {
		return 'B';
	}

}
