package ch07.ch02_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		//Map<Å°, °ª>
		Map<Integer,Member> map= new HashMap<>();
		
		map.put(1, new Member(1,"È«±æµ¿"));
		map.put(2, new Member(2,"È«±æµ¿"));
		map.put(3, new Member(3,"È«±æµ¿"));
		map.put(3, new Member(4,"È«±æµ¿"));
		System.out.println(map.size());
		System.out.println("------");
		//Å°°ªÀ» set À¸·Î ÃßÃâ
		Set<Integer> KeySet=map.keySet();
		
		Iterator<Integer> it= KeySet.iterator();
		while(it.hasNext())
			System.out.print(it.next());
		System.out.println();
		
		Member m1=map.get(1);
		Member m2=map.get(2);
		Member m3=map.get(3);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
	}

}
