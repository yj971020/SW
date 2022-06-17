package ch07.ch02_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		boolean result = false;
		HashSet<String> set = new HashSet<>();

		result = set.add("홍길동"); // add 성공하면 true 반환
		System.out.println(result);
		result = set.add("임꺽정"); // add 성공하면 true 반환
		System.out.println(result);
		result = set.add("홍길동"); // add 성공하면 true 반환
		System.out.println(result);
		result = set.add("김예진"); // add 성공하면 true 반환
		System.out.println(result);
		//set: 순서 없고 중복 불가 (순서대로 들어간 것처럼 보이지만 아닐때도 있음)

		//순서가 없기 때문에 하나씩 뽑으려면 Iterator 사용
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+"\t");
		}
		System.out.println();
		System.out.println(set.contains("김예진")?"있다":"없다");
	}

}
