package ch05.ch01;

public class Point {
	private int x, y;
	public void set(int x ,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {//컬러 점의 좌표 출력 
		System.out.println(color);
		showPoint();//point 의 showPoint 호출 
	}
}

