package ch06;

public class WapperEx2 {
	public static void main(String[] args) {
		// �빮�� -> �ҹ���
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		if ((Character.isDigit(c1))) // c1�� �����̸�
			System.out.println(c1 + "�� ����");
		if ((Character.isAlphabetic(c2)))// ���� c2 �� ������ �̸�
			System.out.println(c2 + "�� ������");

		//Integer ��� ( String -> integer )
		System.out.println(Integer.parseInt("28"));
		//28�� 2���� ���ڿ��� 
		System.out.println(Integer.toBinaryString(28)+" :Integer.toBinaryString(28)"); 
		//28�� ���� 2������ 1�� ����
		System.out.println(Integer.bitCount(28));
		Integer i= Integer.valueOf(28);
		// ������ double ������ ��ȯ 28.0
		System.out.println(i.doubleValue());
		
		//Double ���
		Double d=Double.valueOf(3.14);
		System.out.println(d.toString()); //���ڿ��� ��ȯ
		//���ڿ��� �Ǽ� 3.14�� ��ȯ
		System.out.println(Double.parseDouble("3.14"));
		
	}

}
