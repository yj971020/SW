package ch06.Homework;

import java.util.Scanner;

public class Modify {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s= in.nextLine();
			StringBuffer sb= new StringBuffer(s);
			
			//StringBuffer ��ü�� toString ���� String ���� �ٲ�!
			if(sb.toString().equals("exit")) {  
				System.out.println("�����մϴ�..");
				break;
			}
			int index=(int)(Math.random()*s.length());//������ ���� ��ġ ����
			while(true) {
				int i=(int)(Math.random()*26); // ���ĺ��߿� ����
				char c=(char)('a'+i);
				
				if(!sb.toString().equals(Character.toString(c))) {
					sb.replace(index, index+1,Character.toString(c));
					break;
				}
			}
			System.out.println(sb);
			
		}
		in.close();
	}

}
