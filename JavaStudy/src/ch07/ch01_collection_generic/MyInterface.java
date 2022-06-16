package ch07.ch01_collection_generic;

//함수적 인터페이스
//안에 추상메소드의 개수가 1개여야 하는 인터페이스
@FunctionalInterface   //어노테이션 쓰는 이유- 컴파일시 체킹함.
//만약 안에 추상메소드가 1개 이상이면 오류 뜸 ( 함수적 인터페이스가 아니기 때문)
public interface MyInterface {
	void method();		
	}

class MyInterClass implements MyInterface
{
	int a=10;

	@Override
	public void method() {
		System.out.println("재정의된 메소드");
	}

	
}

