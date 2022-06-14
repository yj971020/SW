package ch05.ch02;

abstract public class Calculator {
	public abstract int add(int a,int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);

}
class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
		for(int num:a) {
			sum+=num;
		}
		return sum;
	}
	
}