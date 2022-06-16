package ch07.ch01_collection_generic;

import java.util.Comparator;
import java.util.Vector;

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();

		// 3개의 Point 객체 삽입
		v.add(new Point(200, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		v.remove(1);

		
		//함수적 인터페이스를 받아온다.
		//sort() 만들기
		v.sort(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2){
				return o1.getX()-o2.getX();
			}
		});
		
		//이걸 람다식으로
		v.sort(( o1,  o2) ->
				o1.getX()-o2.getX());
			
		System.out.println(v.toString());
		
		for (int i = 9; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}


	}

}
