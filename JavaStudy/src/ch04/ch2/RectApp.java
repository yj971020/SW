package ch04.ch2;

import java.util.Scanner;

class Rectagle {
	int width;
	int height;
	public int getArea() {
		return width*height;		
	}
	
}
 
 public class RectApp{
	 public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Rectagle r= new Rectagle();
		System.out.print("가로길이 입력>> ");
		r.width=in.nextInt();
		System.out.print("세로길이 입력>>");
		r.height=in.nextInt();
		System.out.println("넓이는 "+ r.getArea());
		in.close();
	}
 }
