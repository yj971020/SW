package ch03;

import java.util.Random;

public class RamdomEx {
	public static void main(String[] args) {
		//1,2,3 ����
		//Math.random ���
		System.out.println((int)(Math.random()*3)+1);
		
		/*
		 * Random Ŭ���� ���
		 * import �ʿ� 
		 * ��ü.nextInt(����);  --> 0���� ���� �̸��� �� ����
		 */
		
		//seed ���� ����(Random())
		Random r= new Random();
		System.out.println(r.nextInt(10));  //0���� 10�̸�
		
		//seed ������ ����(Random(�õ�)) : ��� ���� ���� ����
		Random k= new Random(5);
		System.out.println(k.nextInt());  //0���� 10�̸�
		
		//seed ������ ����(Random(�õ�)) : ��� ���� ���� ����
		Random m= new Random(5);
		System.out.println(m.nextInt());  //0���� 10�̸�
		
		//������Ȳ�� ���ƾ� �Ҷ� �õ带 ���
		//������Ȳ�� ����? 
		//���� �������� �ִٰ� �����ϸ� ��
		
	}
}
