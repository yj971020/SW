package ch04.ch03_constructor;

public class A {
	//A() 디폴트 생성자
}

class B {
	//디폴트 생성자
	B() {
		System.out.println("B생성자");
	}
}
class C{
	int age;
	C(){
		this("hello");//this() 는 다른 생성자를 호출하는 메소드
	}
	
	C(String msg){ //C(String) 매개변수 있는 생성자 ( 일반생성자)
		System.out.println(msg);
	}
	C(int a){this.age=a;}  //같은 인스턴스내의 자신의 전역변수를 표시 
	//같은 클래스 내 X (클래스: 설계도)
	C(int a,double d){}
	C(double d,int a){}  //매개변수 받는 순서만 달라도 오버로딩 가능
}
