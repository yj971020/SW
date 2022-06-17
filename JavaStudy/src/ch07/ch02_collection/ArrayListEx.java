package ch07.ch02_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("Hi");
		list.add("java");
		list.add("���");
		System.out.println("����� ����: "+list.size());
				
		for(String s:list) {
			System.out.println(s);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.contains("���")?"����":"����");
		//����
		list.add(1,"����");
		System.out.println("����� ����:"+list.size());
		
		//remove(�ε���) //������ ��ü ��ȯ
		String str= list.remove(0);
		System.out.println(str+" ������ ��ü");
		for(String s:list) System.out.println(s);
		
		//sort �Լ� �������̵�
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Objects.hash(o1)- Objects.hash(o2);
			}
		});
		
		//sort  ���ٽ�����
		list.sort((o1,o2) -> Objects.hash(o1)- Objects.hash(o2));
		for(String s: list) System.out.println(s);
		
		// .indexOf(��ü) : ù��° ������ġ lastIndexOf(��ü): ������ ���� ��ġ
		System.out.println(list.indexOf("����")==list.lastIndexOf("����")?"�Ѱ�":"������");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("����");
		list2.add("����");
		list2.remove(0);
		
		for(String s:list2) System.out.println(s);
		
		//�����ڰ� ���� ����ȭ �ڵ� �ۼ� (���ʹ� �ڵ����� ����ȭ)
		//�׷��� ���ؼ��� List Ÿ������ ���
		List<String> l=new ArrayList<>();
		l = Collections.synchronizedList(l); //�����ڰ� ���� ����ȭ �ڵ� �ۼ� (���ʹ� �ڵ����� ����ȭ)
	
	}
}
