package ch02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=100;
		
		System.out.println(b+i);  //byte �� int Ÿ������ �ڵ���ȯ
		System.out.println(10/4); // ����/���� => ����
		System.out.println(10.0/4);  //4 �� 4.0. ���� �ڵ���ȯ
		System.out.println((char)0x12340041);  //16����(int Ÿ�� : 4byte =32bit) char �� 2����Ʈ ( 16��Ʈ ) --> �տ� ������ �ڿ��� ���� 0041�� ������ 
		/*
		 * 00000000 00000000 00000000 0000000 : 4����Ʈ
		 * 1 2 3 4 0 0 4 1
		 * (16���� - > 2���� : 4��Ʈ�� �߶� ǥ��)
		 * 0001 0010 0011 0100 0000 0000 0100 0001 
		 */
		
		System.out.println((byte)(b+i)); //-29
		/*
		 * 1. i �� int �̹Ƿ� b+i �� int �� ��ȯ�Ǿ� ����
		 * ����� 227
		 * ���� byte �� ��ȯ
		 * 00000000 00000000 00000000 11100011 
		 * �������κ� 11100011 ���� �� ù 1�� ������ ���� 
		 * (�� ���ڸ��� ��ȣ�� ǥ��)
		 * 2�Ǻ��� ��� (�������� �ڿ��� ����)
		 * -> ��ǻ�ʹ� -29�� �ν�
		 * */
		
		System.out.println((int)2.9 + 1.8);  // 2.9->2 + 1.8 => 2�� �ٽ� 2.0�� ����ȯ �ǰ� ����
		System.out.println((int)(2.9 + 1.8)); //4.7 -> 4
		System.out.println((int)2.9+(int)1.8); // 
		
		
	}
}
