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
		System.out.print("���α��� �Է�>> ");
		r.width=in.nextInt();
		System.out.print("���α��� �Է�>>");
		r.height=in.nextInt();
		System.out.println("���̴� "+ r.getArea());
		in.close();
	}
 }
