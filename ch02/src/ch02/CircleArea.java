package ch02;

public class CircleArea {
public static void main(String[] args) {	
	final double pi=3.14;
	double radius=10.2;
	double circleArea=radius*radius*pi;
	System.out.println("������ "+circleArea);
	
	String s=Integer.toBinaryString(300); //300�� ������
	//���� byte �� ��ȯ�Ѵٸ� 
	// 00000000 00000000 00000001 00101100
	// 1����Ʈ = 8��Ʈ
	// 8�ڸ� �����ۿ� �� ���� -> �Ǿ� 1 �� ©�� 
	// ���� 44�� �ٲ�� �ջ��
	
	System.out.println(s);
	
	System.out.println(3.14*10.0); 	//31.400000000000002  :��ǻ�͵� ���� ����
	System.out.printf("%.3f",3.14*10); //31.400 �Ҽ��� 3�ڸ����� ���
	//printf("����",��); 
}
}
