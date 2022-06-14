package ch06;

import java.util.Objects;

class Point{
	private int x,y;
	public Point(int x,int y) {
		this.x=x; this.y=y;
	}
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		Point other = (Point) obj; 
		return x == other.x && y == other.y;
	}
	
}
public class ObjectPropertyEx {
	public static void main(String[] args) {
		Point p= new Point(2,3);
		System.out.println(p.getClass().getName()); //클래스 이름
		System.out.println(p.hashCode()); //해시코드값
		System.out.println(p.toString()); //객체의 문자열
		System.out.println();

		Class clazz= p.getClass();
		System.out.println(clazz.getPackageName()); // 클래스 패키지 경로
		System.out.println(clazz.getSimpleName()); //클래스 명
		System.out.println(clazz.getConstructors()[0]); // 생성자 정보
		
		Point a= new Point(2,3);
		Point b= new Point(2,3);
		Point c;
		c=a;
		
		System.out.println(a==b); //참조값(주소값이 다름)
		System.out.println(a==c); //같은 객체 가르킴
		if(a.equals(b)) {System.out.println("a와 b 의 값이 같음");}
		if(a.equals(c))  {System.out.println("a와 c 의 값이 같음");}
		
	}

}
