package ch05.Homework;

public class ShapeApp {
	public static void main(String[] args) {
		Shape coin= new Circle(10);
		coin.redraw();
		System.out.println("������ ������ "+coin.getArea());
	}

}
