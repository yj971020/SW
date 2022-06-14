package ch05.ch03_interface;

public interface PhoneInterface {
	/*
	 * 상수 변수는 선언 불가, 상수만 가능 
	 * static final int TIMEOUT=10000; 
	 * 인터페이스는 모든 클래스가 사용가능하기 때문에 퍼블릭 임
	 */
	int TIMEOUT = 10000;
	// public static final 이 생략됨 - 인터페이스 한정
	// 기능-추상메소드

	// public abstract void sendCall();
	// public abstract 생략됨
	void sendCall();

	// public abstract void recieveCall();
	// public abstract 생략됨
	void recieveCall();

	/*
	 * 원래는 인터페이스에서 메소드 구현 불가 default 키워드 사용하여 메소드 구현 가능 (java 8) static, private
	 * 메소드는 사용 가능 (java 9)
	 */
	public default void printLogo() {
		System.out.println("**phone**");
	}
	
	static void pirntvoid() {
		System.out.println("printvoid");
	}

}
class Calc{
	public int calculate(int x,int y) {
		return x+y;
	}
}
