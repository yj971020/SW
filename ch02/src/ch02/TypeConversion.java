package ch02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=100;
		
		System.out.println(b+i);  //byte 는 int 타입으로 자동변환
		System.out.println(10/4); // 정수/정수 => 정수
		System.out.println(10.0/4);  //4 가 4.0. 으로 자동변환
		System.out.println((char)0x12340041);  //16진수(int 타입 : 4byte =32bit) char 은 2바이트 ( 16비트 ) --> 앞에 버리고 뒤에만 남김 0041만 가져옴 
		/*
		 * 00000000 00000000 00000000 0000000 : 4바이트
		 * 1 2 3 4 0 0 4 1
		 * (16진수 - > 2진수 : 4비트로 잘라 표현)
		 * 0001 0010 0011 0100 0000 0000 0100 0001 
		 */
		
		System.out.println((byte)(b+i)); //-29
		/*
		 * 1. i 가 int 이므로 b+i 는 int 로 변환되어 연산
		 * 결과는 227
		 * 이후 byte 로 변환
		 * 00000000 00000000 00000000 11100011 
		 * 마지막부분 11100011 에서 맨 첫 1은 음수를 뜻함 
		 * (맨 앞자리는 부호를 표시)
		 * 2의보수 계산 (보수계산법 뒤에서 설명)
		 * -> 컴퓨터는 -29로 인식
		 * */
		
		System.out.println((int)2.9 + 1.8);  // 2.9->2 + 1.8 => 2가 다시 2.0로 형변환 되고 연산
		System.out.println((int)(2.9 + 1.8)); //4.7 -> 4
		System.out.println((int)2.9+(int)1.8); // 
		
		
	}
}
