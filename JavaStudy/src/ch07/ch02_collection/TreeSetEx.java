package ch07.ch02_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	//TreeSet 구조는 저장될때에 부모와 값을 비교하여 왼쪽노드, 오른쪽 노드를 선택하여 저장하므로
	//타입매개변수에 해당하는 객체에 Comparable 을 구현해야 한다. 그래야 비교 대상을 정하고 저장 가능

	public static void main(String[] args) {
		Set<Member> set = new TreeSet<>();
		System.out.println(set.add(new Member(1, "홍길동")));
		System.out.println(set.add(new Member(2, "일지매")));
		System.out.println(set.add(new Member(1, "홍길동")));
		System.out.println(set.add(new Member(4, "임꺽정")));
		System.out.println(set.contains(new Member(1, "홍길동")));

		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr)+"\n Arrays.toString(arr) , arr는 Object 형");
		

		// 소모성 객체
		Iterator<Member> it = set.iterator();

		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("----------------");
		// 다 소모 했으니까 또 쓰려면 다시 넣어주어야 함
		it = set.iterator();

		while (it.hasNext()) {
			Member m = it.next();
			if (m.equals(new Member(1, "홍길동")))
				System.out.println(m + " 홍길동 찾기");
		}
		
		//Set 형에 메소드 추가된게 TreeSet 임. 그 메소드 이용하려면 다시 다운캐스팅
		Member m=((TreeSet<Member>)set).last(); 		
		System.out.println(m);
	}

}
