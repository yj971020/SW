package ch04.ch2;

public class Cat extends Animal {
	@Override
	void speak() {
		System.out.println("����� ���.");
		super.speak();  //�θ��� �޼ҵ� ����
	}
	void catEat() {
		System.out.println("����� �Դ´�");
	}

}
