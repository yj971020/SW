package ch05.Homework;

public class Circle implements Shape{
	private int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	@Override
	public void draw() {
		System.out.print("������"+radius);
	}

	@Override
	public double getArea() {
		return PI*radius*radius;
	}
}
