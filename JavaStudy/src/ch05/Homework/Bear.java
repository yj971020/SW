package ch05.Homework;

import java.util.Scanner;

public class Bear extends GameObject {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);

	}

	@Override
	protected void move() {
		Scanner in = new Scanner(System.in);
		System.out.print(" �� (a) ��(f) ��(d) �Ʒ�(s) �� �Ѱ����� �Է��ϼ���");
		String move = in.next();
		switch (move) {
			case "d": // ��
				x--;
				if (x < 0)
				x = (10 + x);
				break;
				
			case "s": // �Ʒ�
				x = (x + 1) % 10;
				break;
				
			case "a": // ��
				y = y - 1;
				if (y < 0)
					y = 19;
				break;
				
			case "f": //��
				y = (y + 1) % 20; 
				break;
		}
	}

	@Override
	protected char getShape() {
		return 'B';
	}

}
