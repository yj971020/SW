package ch07.ch02_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		//Map<Ű, ��>
		Map<Integer,Member> map= new HashMap<>();
		
		map.put(1, new Member(1,"ȫ�浿"));
		map.put(2, new Member(2,"ȫ�浿"));
		map.put(3, new Member(3,"ȫ�浿"));
		map.put(3, new Member(4,"ȫ�浿"));
		System.out.println(map.size());
		System.out.println("------");
		//Ű���� set ���� ����
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
