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
		//�ؽ����̺� : ������ ����ȭ
		
		map.put(1,"ȫ�浿");
		map.put(2, "�Ӳ���");
		map.put(3, "ȫ�浿");
		map.put(2, "�̼���"); // Ű �ߺ��� ���� �������� ���� value �� �ٲ�
		
		//�������� Ű�� �����
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();  //Ű ���� iterator �� 
		
		//HashMap �� �ִ°��� ���������� Ž��
		while(it.hasNext()) {
			int i=it.next();
			String s=map.get(i);
			System.out.println(i+":key, "+s+":value");
		}
		
		//key �� ���忩�� Ȯ��
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("�̼���")?"����":"����");
		
		Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
		Iterator<Map.Entry<Integer, String>> itor=entrySet.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		System.out.println(map.values()); //���� ����
		map.remove(1);
		System.out.println(map.values());
		
	}

}
