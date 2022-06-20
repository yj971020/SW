package ch07.ch04_Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		list=Collections.synchronizedList(list);
		
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(6);
		
	}

}
