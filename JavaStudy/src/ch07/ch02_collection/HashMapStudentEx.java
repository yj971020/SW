package ch07.ch02_collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {
	public static void main(String[] args) {
		//학생 이름과 student 객체 생성
		HashMap<String,Student> map=new HashMap<>();
		
		map.put("황기태", new Student(1, "010-1111-1111"));
		map.put("이재문", new Student(1, "010-2222-2222"));
		map.put("장희경", new Student(1, "010-3333-3333"));
		
		Scanner in= new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name=in.nextLine();
			if(map.containsKey(name)) {
				System.out.println("검색한 학생 id"+map.get(name).id+"검색한 학생 전번+ "+map.get(name).tel);
				
				
			}
			else {
				System.out.println("그런사람 없음둥");
				continue;
			}
		}
	}

}
