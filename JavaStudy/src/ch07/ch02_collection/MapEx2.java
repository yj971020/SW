package ch07.ch02_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<>();
		//Map<Integer,String> map= new Hashtable()<>(); 
		//해시테이블 : 스레드 동기화
		
		map.put(1,"홍길동");
		map.put(2, "임꺽정");
		map.put(3, "홍길동");
		map.put(2, "이순신"); // 키 중복시 값이 마지막에 넣은 value 로 바뀜
		
		//순서없이 키가 저장됨
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();  //키 값을 iterator 에 
		
		//HashMap 에 있는것을 순차적으로 탐색
		while(it.hasNext()) {
			int i=it.next();
			String s=map.get(i);
			System.out.println(i+":key, "+s+":value");
		}
		
		//key 의 저장여부 확인
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("이순신")?"있음":"없음");
		
		Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
		Iterator<Map.Entry<Integer, String>> itor=entrySet.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		System.out.println(map.values()); //값만 추출
		map.remove(1);
		System.out.println(map.values());
		
	}

}
