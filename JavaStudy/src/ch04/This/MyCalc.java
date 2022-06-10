package ch04.This;

public class MyCalc {
	int a=10;
	int b=10;
	static int sum(int a,int b) {  //static 메모리에 올라가기 때문에 객체 만들 필요 없음
		return a+b;					// 우선적으로 메모리에 올라가있음 . 인스턴스에 속하지 않음 
		//this.a 이런식으로 사용 불가능
		//static메소드에서는 this 쓸 수 없다. static 은 따로 저장하기 때문
	}
	int sum(double a, double b) {  //static 이 아니기 때문에 인스턴스에 들어감
		return (int)(a+b);
	}
	public static void main(String[] args) {
		MyCalc m= new MyCalc();
		int result=m.sum(10.0, 10.0);
		System.out.println(result);
		
		int result2=MyCalc.sum(5, 6);  //static 이기 때문에 객체 만들 필요 없음 
		System.out.println(result2);
	}

}
