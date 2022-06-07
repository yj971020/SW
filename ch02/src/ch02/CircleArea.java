package ch02;

public class CircleArea {
public static void main(String[] args) {	
	final double pi=3.14;
	double radius=10.2;
	double circleArea=radius*radius*pi;
	System.out.println("반지름 "+circleArea);
	
	String s=Integer.toBinaryString(300); //300의 이진수
	//만약 byte 로 변환한다면 
	// 00000000 00000000 00000001 00101100
	// 1바이트 = 8비트
	// 8자리 까지밖에 못 넣음 -> 맨앞 1 이 짤림 
	// 값이 44로 바뀌며 손상됨
	
	System.out.println(s);
	
	System.out.println(3.14*10.0); 	//31.400000000000002  :컴퓨터도 오차 존재
	System.out.printf("%.3f",3.14*10); //31.400 소수점 3자리까지 출력
	//printf("포맷",값); 
}
}
