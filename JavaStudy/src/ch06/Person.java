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
		
	//�̸��� ���̰� ������ �����ι��� ����
	Person gildong1= new Person("�浿",10);	
	Person gildong2= new Person("�浿",30);	//��������
	Person gildong3= new Person("�浿",10);	//10���� �����ι�
	
	System.out.println(gildong1.equals(gildong2));
	System.out.println(gildong1.equals(gildong3));
	}

}
