package ch04.This;

public class MyCalc {
	int a=10;
	int b=10;
	static int sum(int a,int b) {  //static �޸𸮿� �ö󰡱� ������ ��ü ���� �ʿ� ����
		return a+b;					// �켱������ �޸𸮿� �ö����� . �ν��Ͻ��� ������ ���� 
		//this.a �̷������� ��� �Ұ���
		//static�޼ҵ忡���� this �� �� ����. static �� ���� �����ϱ� ����
	}
	int sum(double a, double b) {  //static �� �ƴϱ� ������ �ν��Ͻ��� ��
		return (int)(a+b);
	}
	public static void main(String[] args) {
		MyCalc m= new MyCalc();
		int result=m.sum(10.0, 10.0);
		System.out.println(result);
		
		int result2=MyCalc.sum(5, 6);  //static �̱� ������ ��ü ���� �ʿ� ���� 
		System.out.println(result2);
	}

}
