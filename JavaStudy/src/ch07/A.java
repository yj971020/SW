package ch07;

public class A {

	A a= new B();
	B b1=(B) a;
	C c=(C) a;
}
class B extends A{}
class C extends A{}


