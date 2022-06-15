package ch06;

public class WapperEx2 {
	public static void main(String[] args) {
		// 대문자 -> 소문자
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		if ((Character.isDigit(c1))) // c1이 문자이면
			System.out.println(c1 + "는 숫자");
		if ((Character.isAlphabetic(c2)))// 문자 c2 가 영문자 이면
			System.out.println(c2 + "는 영문자");

		//Integer 사용 ( String -> integer )
		System.out.println(Integer.parseInt("28"));
		//28을 2진수 문자열로 
		System.out.println(Integer.toBinaryString(28)+" :Integer.toBinaryString(28)"); 
		//28에 대한 2진수의 1의 개수
		System.out.println(Integer.bitCount(28));
		Integer i= Integer.valueOf(28);
		// 정수를 double 값으로 변환 28.0
		System.out.println(i.doubleValue());
		
		//Double 사용
		Double d=Double.valueOf(3.14);
		System.out.println(d.toString()); //문자열을 반환
		//문자열을 실수 3.14로 반환
		System.out.println(Double.parseDouble("3.14"));
		
	}

}
