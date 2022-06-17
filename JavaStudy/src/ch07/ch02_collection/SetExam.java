package ch07.ch02_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		System.out.println(set.add(new Member(1, "ȫ�浿")));
		System.out.println(set.add(new Member(2, "������")));
		System.out.println(set.add(new Member(1, "ȫ�浿")));
		System.out.println(set.add(new Member(4, "�Ӳ���")));
		System.out.println(set.contains(new Member(1, "ȫ�浿")));

		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr)+"\n Arrays.toString(arr) , arr�� Object ��");
		

		// �Ҹ� ��ü
		Iterator<Member> it = set.iterator();

		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("----------------");
		// �� �Ҹ� �����ϱ� �� ������ �ٽ� �־��־�� ��
		it = set.iterator();

		while (it.hasNext()) {
			Member m = it.next();
			if (m.equals(new Member(1, "ȫ�浿")))
				System.out.println(m + " ȫ�浿 ã��");
		}
	}
}
