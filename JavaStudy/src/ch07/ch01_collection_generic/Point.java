package ch07.ch01_collection_generic;

public class Point {
	private int x,y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}
