package ch07.ch01_collection_generic;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		//���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<>();
		System.out.println( v.capacity());
		v.add(5);
		v.add(4);
		v.add(-1);
		
		//���� �߰��� �����ϱ�
		v.add(2,100); // 4�� -1 ���̿� ���� 100 ����
		System.out.println("���� ���� ��� ��ü �� : "+v.size());
		System.out.println("������ ���� �뷮 : "+ v.capacity());
		
		//��� ��� ���� ����ϱ�
		for(int i=0;i<v.size();i++) {
			int n= v.get(i);
			System.out.println(n);
		}
		
		int sum=0;
		for(int i=0;i<v.size();i++) {
			int n=v.elementAt(i);
			sum+=n;
		}
		v.sort(null);
		System.out.println("���Ϳ� �ִ� ���� ��: "+sum);
	}

}
