package ch07.ch01_collection_generic;

public class MyInterfaceMain {
	public static void main(String[] args) {
		
		//인터페이스 참조변수로 자식 클래스의 객체 참조
		MyInterface mi=new MyInterClass();
		
		mi.method();  //mi.a
		
		//무명 인터페이스  - 여기에서만 쓰고 버릴것임
		//원래 인터페이스로는 객체 생성 불가.
		MyInterface mi2=new MyInterface() {
			//이 부분 자체가 상속을 받은 것
			int a=10;
			@Override
			public void method() {
			System.out.println("재정의된 메소드 mi2");
			}
		};
		
		mi2.method();
		//mi2.a -> 오류. 외부에선 a 에 접근 불가
		//MyInterface 의 참조변수로 받았고, int a=0; 은 추가 된것.
		//부모에 없던 필드이므로 접근 불가 
		
		MyInterface mi3=new MyInterface() {
			//이 부분 자체가 상속을 받은 것
			int a=10;
			@Override
			public void method() {
			System.out.println("재정의된 메소드 mi3");
			}	
		};
		mi3.method();
	}
	//람다식
	// = 을 기준으로 타입이 같아야함 - > 그냥 오른쪽 꺼 생략 해버림
	//매개변수만 알면 되므로 함수명도 제거
	MyInterface mi4=()->System.out.println("재정의 mi4");



}
