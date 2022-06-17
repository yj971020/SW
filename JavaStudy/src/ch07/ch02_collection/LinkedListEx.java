package ch07.ch02_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListEx {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("대전");
		
		System.out.println(list.contains("서울")?"일정에 존재":"일정에 없음");
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {	
			System.out.print(it.next()+"/");
		}
		System.out.println();
		
		Vector<String> v = new Vector<>();
		v.add("천안");
		v.add("전주");
		
		list.addAll(v);
		list.sort((o1,o2)->o1.hashCode()-o2.hashCode());
		it=list.iterator();
		
		while(it.hasNext()) {	
			System.out.print(it.next()+"/");	
		}
		System.out.println();
		
		System.out.println(list);
		Object[] obList =list.toArray();
		System.out.println(Arrays.toString(obList));
	}
}
