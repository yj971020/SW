package ch06;

import java.util.Objects;

public class Person {
	String name;
	int age;
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}


	public static void main(String[] args)
	{
		
	//이름과 나이가 같으면 동일인물로 관리
	Person gildong1= new Person("길동",10);	
	Person gildong2= new Person("길동",30);	//동명이인
	Person gildong3= new Person("길동",10);	//10세의 동일인물
	
	System.out.println(gildong1.equals(gildong2));
	System.out.println(gildong1.equals(gildong3));
	}

}
