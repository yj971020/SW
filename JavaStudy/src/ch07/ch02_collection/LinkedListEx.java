package ch07.ch02_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListEx {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("����");
		
		System.out.println(list.contains("����")?"������ ����":"������ ����");
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {	
			System.out.print(it.next()+"/");
		}
		System.out.println();
		
		Vector<String> v = new Vector<>();
		v.add("õ��");
		v.add("����");
		
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
