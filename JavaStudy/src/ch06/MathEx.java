package ch06;

public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.exp(2)); //e^2
		System.out.println(Math.round(3.14));   //�ݿø�
		//round : �Ҽ� ù��° �ڸ����� �ݿø�
		//���� �Ҽ� ��°�ڸ� ���� ��Ÿ���� �ʹٸ� ���ڿ� *100 �Ͽ� round -> ��� / 100
		System.out.println(Math.ceil(3.14));   //����
		System.out.println(Math.floor(3.14));  //�ø�
		
		//�ݿø��� �ٸ� ��� : String.format()
		double pie = 3.14159265358979;
		double money = 4424.243423;
		System.out.println(String.format("%.2f", pie)); //��� : 3.14
		System.out.println(String.format("%.3f", pie)); //��� : 3.142
		System.out.println(String.format("%,.3f", money)); //��� : 4,424.243
	}

}
