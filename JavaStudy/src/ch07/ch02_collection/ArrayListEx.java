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
		list.add("사과");
		System.out.println("저장된 갯수: "+list.size());
				
		for(String s:list) {
			System.out.println(s);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.contains("사과")?"있음":"없음");
		//삽입
		list.add(1,"감자");
		System.out.println("저장된 갯수:"+list.size());
		
		//remove(인덱스) //삭제한 객체 반환
		String str= list.remove(0);
		System.out.println(str+" 삭제한 객체");
		for(String s:list) System.out.println(s);
		
		//sort 함수 오버라이드
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Objects.hash(o1)- Objects.hash(o2);
			}
		});
		
		//sort  람다식으로
		list.sort((o1,o2) -> Objects.hash(o1)- Objects.hash(o2));
		for(String s: list) System.out.println(s);
		
		// .indexOf(객체) : 첫번째 저장위치 lastIndexOf(객체): 마지막 저장 위치
		System.out.println(list.indexOf("감자")==list.lastIndexOf("감자")?"한개":"여러개");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("고구마");
		list2.add("감자");
		list2.remove(0);
		
		for(String s:list2) System.out.println(s);
		
		//개발자가 직접 동기화 코드 작성 (벡터는 자동으로 동기화)
		//그러기 위해서는 List 타입으로 언언
		List<String> l=new ArrayList<>();
		l = Collections.synchronizedList(l); //개발자가 직접 동기화 코드 작성 (벡터는 자동으로 동기화)
	
	}
}
