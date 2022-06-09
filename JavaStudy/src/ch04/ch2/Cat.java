package ch04.ch2;

public class Cat extends Animal {
	@Override
	void speak() {
		System.out.println("고양이 운다.");
		super.speak();  //부모의 메소드 실행
	}
	void catEat() {
		System.out.println("고양이 먹는다");
	}

}
