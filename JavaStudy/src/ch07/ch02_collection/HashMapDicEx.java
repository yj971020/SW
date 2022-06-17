package ch07.ch02_collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapDicEx {
	public static void main(String[] args) {
		
		HashMap<String,String> dic=new HashMap<String,String>();
		dic.put("baby", "아기");
		dic.put("apple", "사과");
		dic.put("love", "사랑");
		
		List<String> list=Arrays.asList("바보","fuck"); //Arrays->List 로 
		
		Scanner in=new Scanner(System.in);
		boolean run=true;
		while(run) {
		System.out.print("영어를 입력하세요>> ");
		String s=in.next();
		if(s.equals("exit")) {
			System.out.println("종료합니다.");
			run=!run;
			break;
		}
		else {
			if(list.contains(s)) {
				System.out.println("금칙어");
				continue;
			}
			if(!dic.containsKey(s)) {
				System.out.println("없는 단어");
				continue;				
			}
			else
			System.out.println(dic.get(s));
		}
		
		}
	}

}
