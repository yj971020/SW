package ch02;

public class Test {
	public static void main(String[] args) {
		byte b= 127;   //byte : -128 ~ 127
		
		for ( int i=-200;i<200;i++) {
			System.out.print(b+i+ " ");  //오버플로우가 발생하지 않음 : 연산시에는 int 로 형변환 되어 연산되기 때문
		
		}
		System.out.println();
		for(int i=-200;i<200;i++) {
			System.out.print((byte)(b+i)+" "); //오버플로우 발생
		}
	}
}
