package ch07.ch02_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		boolean result = false;
		HashSet<String> set = new HashSet<>();

		result = set.add("ȫ�浿"); // add �����ϸ� true ��ȯ
		System.out.println(result);
		result = set.add("�Ӳ���"); // add �����ϸ� true ��ȯ
		System.out.println(result);
		result = set.add("ȫ�浿"); // add �����ϸ� true ��ȯ
		System.out.println(result);
		result = set.add("�迹��"); // add �����ϸ� true ��ȯ
		System.out.println(result);
		//set: ���� ���� �ߺ� �Ұ� (������� �� ��ó�� �������� �ƴҶ��� ����)

		//������ ���� ������ �ϳ��� �������� Iterator ���
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+"\t");
		}
		System.out.println();
		System.out.println(set.contains("�迹��")?"�ִ�":"����");
	}

}
