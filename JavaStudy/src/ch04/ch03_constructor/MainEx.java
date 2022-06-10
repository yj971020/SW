package ch04.ch03_constructor;

public class MainEx {
	public static void main(String[] args) {
		
		A a= new A();
		B b =new B();
		C c = new C();
		C c1 = new C("hello");
		C c2= new C(10);
		C c3= new C(10,3.14);
		C c4= new C(3.14,10);
	}
	

}
