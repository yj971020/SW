package ch01.ch02;

// class: 클래스를 선언하는 예약어 ( reserved word )
// public 은 다른 패키지의 클래스나 같은 패키지의 클래스에서 모두 접근 가능하게 하는 예약어
// Hello 는 사용자가 만든 식별자
public class Hello {
	
	
	public static int sum(int m,int n) {
		return n+m;
	}
	//static 은 static 이라는 메모리 공간에 로딩하라는 예약어
	//void 메소드의 실행결과를 리턴하지 않겠다는 의미
	//String[] 배열이라는 의미 String 
	public static void main(String[] args) {
		int i=20;
		int s;
		char a;
		
		s=sum(i,10);
		a='?'; // 변수 a 를 읽기 전에 초기화 했음
		System.out.println(a);
		System.out.println(s);
		System.out.println("hello");
		

	}

}
