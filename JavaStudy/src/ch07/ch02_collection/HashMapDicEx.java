package ch07.ch02_collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapDicEx {
	public static void main(String[] args) {
		
		HashMap<String,String> dic=new HashMap<String,String>();
		dic.put("baby", "�Ʊ�");
		dic.put("apple", "���");
		dic.put("love", "���");
		
		List<String> list=Arrays.asList("�ٺ�","fuck"); //Arrays->List �� 
		
		Scanner in=new Scanner(System.in);
		boolean run=true;
		while(run) {
		System.out.print("��� �Է��ϼ���>> ");
		String s=in.next();
		if(s.equals("exit")) {
			System.out.println("�����մϴ�.");
			run=!run;
			break;
		}
		else {
			if(list.contains(s)) {
				System.out.println("��Ģ��");
				continue;
			}
			if(!dic.containsKey(s)) {
				System.out.println("���� �ܾ�");
				continue;				
			}
			else
			System.out.println(dic.get(s));
		}
		
		}
	}

}
