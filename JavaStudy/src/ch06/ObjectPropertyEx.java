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
		System.out.println(p.getClass().getName()); //Ŭ���� �̸�
		System.out.println(p.hashCode()); //�ؽ��ڵ尪
		System.out.println(p.toString()); //��ü�� ���ڿ�
		System.out.println();

		Class clazz= p.getClass();
		System.out.println(clazz.getPackageName()); // Ŭ���� ��Ű�� ���
		System.out.println(clazz.getSimpleName()); //Ŭ���� ��
		System.out.println(clazz.getConstructors()[0]); // ������ ����
		
		Point a= new Point(2,3);
		Point b= new Point(2,3);
		Point c;
		c=a;
		
		System.out.println(a==b); //������(�ּҰ��� �ٸ�)
		System.out.println(a==c); //���� ��ü ����Ŵ
		if(a.equals(b)) {System.out.println("a�� b �� ���� ����");}
		if(a.equals(c))  {System.out.println("a�� c �� ���� ����");}
		
	}

}
