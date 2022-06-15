package ch06;

public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.exp(2)); //e^2
		System.out.println(Math.round(3.14));   //반올림
		//round : 소수 첫번째 자리에서 반올림
		//만약 소수 둘째자리 까지 나타내고 싶다면 숫자에 *100 하여 round -> 결과 / 100
		System.out.println(Math.ceil(3.14));   //버림
		System.out.println(Math.floor(3.14));  //올림
		
		//반올림의 다른 방법 : String.format()
		double pie = 3.14159265358979;
		double money = 4424.243423;
		System.out.println(String.format("%.2f", pie)); //결과 : 3.14
		System.out.println(String.format("%.3f", pie)); //결과 : 3.142
		System.out.println(String.format("%,.3f", money)); //결과 : 4,424.243
	}

}
