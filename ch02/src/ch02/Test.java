package ch02;

public class Test {
	public static void main(String[] args) {
		byte b= 127;   //byte : -128 ~ 127
		
		for ( int i=-200;i<200;i++) {
			System.out.print(b+i+ " ");  //�����÷ο찡 �߻����� ���� : ����ÿ��� int �� ����ȯ �Ǿ� ����Ǳ� ����
		
		}
		System.out.println();
		for(int i=-200;i<200;i++) {
			System.out.print((byte)(b+i)+" "); //�����÷ο� �߻�
		}
	}
}
