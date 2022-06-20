package ch07.ch04_Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> iter = l.iterator();
		while (iter.hasNext()) {
			String e = iter.next();
			String separator;
			if (iter.hasNext()) {
				separator = "->";
			} else
				separator = "\n";
			System.out.print(e + separator);
		}
	}

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");

		Collections.sort(myList);
		printList(myList);

		Collections.reverse(myList);
		printList(myList);

		int index = Collections.binarySearch(myList, "�ƹ�Ÿ")+1;
		System.out.println("�ƹ�Ÿ�� "+ index +"��° ����Դϴ�.");
		
	}

}
