package ch07.ch02_collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {
	public static void main(String[] args) {
		//�л� �̸��� student ��ü ����
		HashMap<String,Student> map=new HashMap<>();
		
		map.put("Ȳ����", new Student(1, "010-1111-1111"));
		map.put("���繮", new Student(1, "010-2222-2222"));
		map.put("�����", new Student(1, "010-3333-3333"));
		
		Scanner in= new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�?");
			String name=in.nextLine();
			if(map.containsKey(name)) {
				System.out.println("�˻��� �л� id"+map.get(name).id+"�˻��� �л� ����+ "+map.get(name).tel);
				
				
			}
			else {
				System.out.println("�׷���� ������");
				continue;
			}
		}
	}

}
