package ch04;

public class Circle {
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza=new Circle();
		pizza.name="�ڹ�����";
		pizza.radius=10;
		double area=pizza.getArea();
		System.out.println(pizza.name+"�� ������"+area);
		
		Circle donut=new Circle();
		donut.radius=2;
		donut.name="�ڹٵ���";
		area=donut.getArea();
		System.out.println(donut.name+"�� ������"+area);
	}
}
