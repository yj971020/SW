package ch04.ch2;

//다형성
public class Dog extends Animal{
	@Override
	void speak() { //signature - 메소드명 : 타입과 매개변수 타입. 수, 순서
		
		System.out.println("강아지 멍멍");;
	}
	
	void speak(int a) {
		System.out.println(a+"번 멍멍");
	}
}
