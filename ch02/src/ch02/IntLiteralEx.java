package ch02;

public class IntLiteralEx {
	
	public static void main(String[] args) {
		int m = 15; // int ���ͷ�
		int k = 015; // 8���� : 0���� ����
		int n = 0x25; // 16����
		int b = 0b0101; // 2����
		long l = 24l; // long Ÿ��
		
		System.out.println(m);
		System.out.println(k);
		System.out.println(n);
		System.out.println(b);
		System.out.println(l);
		
		//�Ǽ�
		float f = .1234f;  //float ���� �ڿ� f !
		double d= .1234;
		
		//����
		char c1='��';
		char c2= '\uae00';  // u �� �����ڵ��� �� ae00 �� 16����
		
		System.out.println(c1);
		System.out.println(c2);  //����� = '��'
		
		//���ڿ� ���ͷ� 
		String str = " good ";   //������ ��ü�� ������ �� (����Ÿ��)
		String str2= new String("good");
		
		//���
		final double PI=3.141592;
		
		Static_ex se1=new Static_ex();
		Static_ex se2=new Static_ex();
		Static_ex se3=new Static_ex();
		
		
		
		
		
	}
}
