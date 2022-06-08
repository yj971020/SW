package ch01.ch02;

public class Test01 {

	static int x=10;
	static int y=20;
	
	public static void main(String[] args) {
		int result1=sum1(10,10);
		System.out.println("result1="+ result1);
		sum2(10,10);

	}
	
	static int sum1(int x,int y) {
		return x+y;
	}
	
	static void sum2(int x,int y) {
		System.out.println(x+y);
		return;
	}
	
	static int sum3() {
		return x+y;
	}
	
	static void sum4() {
		System.out.println(x+y);
	}
}
