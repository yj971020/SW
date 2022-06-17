package ch07.ch02_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
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
	}
}
