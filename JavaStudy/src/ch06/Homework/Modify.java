package ch06.Homework;

import java.util.Scanner;

public class Modify {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s= in.nextLine();
			StringBuffer sb= new StringBuffer(s);
			
			//StringBuffer 객체를 toString 으로 String 으로 바꿔!
			if(sb.toString().equals("exit")) {  
				System.out.println("종료합니다..");
				break;
			}
			int index=(int)(Math.random()*s.length());//변경할 문자 위치 선택
			while(true) {
				int i=(int)(Math.random()*26); // 알파벳중에 선택
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
