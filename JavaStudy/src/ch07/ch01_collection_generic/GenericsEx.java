package ch07.ch01_collection_generic;

import java.util.Vector;

public class GenericsEx {
	public static void main(String[] args) {
		//���׸� <Ÿ��>
		Vector<Integer> v1=new Vector<>();
		v1.add(1); //add()
		v1.add(3);
		for(int i=0;i<v1.size();i++) {  //size() :���� <-> length : ���� 
			System.out.println(v1.get(i)); //get(�ε���)
		}
		
		Vector<String> v2=new Vector<>();
		v2.add("hello"); //add()
		v2.add("adf");
		v2.add("1234");
		for(int i=0;i<v2.size();i++) {  //size() :���� <-> length : ���� 
			System.out.println(v2.get(i)); //get(�ε���)
		}
	}
}
