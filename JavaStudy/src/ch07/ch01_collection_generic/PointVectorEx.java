package ch07.ch01_collection_generic;

import java.util.Comparator;
import java.util.Vector;

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();

		// 3���� Point ��ü ����
		v.add(new Point(200, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		v.remove(1);

		
		//�Լ��� �������̽��� �޾ƿ´�.
		//sort() �����
		v.sort(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2){
				return o1.getX()-o2.getX();
			}
		});
		
		//�̰� ���ٽ�����
		v.sort(( o1,  o2) ->
				o1.getX()-o2.getX());
			
		System.out.println(v.toString());
		
		for (int i = 9; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}


	}

}
