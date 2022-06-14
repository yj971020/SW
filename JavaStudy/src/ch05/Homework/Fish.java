package ch05.Homework;

public class Fish extends GameObject {
	private static int count=0;
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
		if (count%5>2) { 
				int move = (int) (Math.random() * 3); // 0~4
				switch (move) {
				case 0: // À§
					x--;
					if (x < 0)
						x = (10 + x);
					break;

				case 1: // ¾Æ·¡
					x = (x + 1) % 10;
					break;

				case 2: // ¿Þ
					y = y - 1;
					if (y < 0)
						y = 19;
					break;

				case 3: // ¿À
					y = (y + 1) % 20;
					break;
				}
			}
		count++;
		}
	

	@Override
	protected char getShape() {
		return '@';
	}

}
