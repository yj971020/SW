package ch02;

public class IntLiteralEx {
	
	public static void main(String[] args) {
		int m = 15; // int 리터럴
		int k = 015; // 8진수 : 0으로 시작
		int n = 0x25; // 16진수
		int b = 0b0101; // 2진수
		long l = 24l; // long 타입
		
		System.out.println(m);
		System.out.println(k);
		System.out.println(n);
		System.out.println(b);
		System.out.println(l);
		
		//실수
		float f = .1234f;  //float 형은 뒤에 f !
		double d= .1234;
		
		//문자
		char c1='글';
		char c2= '\uae00';  // u 는 유니코드라는 뜻 ae00 은 16진수
		
		System.out.println(c1);
		System.out.println(c2);  //결과값 = '글'
		
		//문자열 리터럴 
		String str = " good ";   //실제론 객체가 생성된 것 (참조타입)
		String str2= new String("good");
		
		//상수
		final double PI=3.141592;
		
		Static_ex se1=new Static_ex();
		Static_ex se2=new Static_ex();
		Static_ex se3=new Static_ex();
		
		
		
		
		
	}
}
