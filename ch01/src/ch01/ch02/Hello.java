package ch01.ch02;

// class: Ŭ������ �����ϴ� ����� ( reserved word )
// public �� �ٸ� ��Ű���� Ŭ������ ���� ��Ű���� Ŭ�������� ��� ���� �����ϰ� �ϴ� �����
// Hello �� ����ڰ� ���� �ĺ���
public class Hello {
	
	
	public static int sum(int m,int n) {
		return n+m;
	}
	//static �� static �̶�� �޸� ������ �ε��϶�� �����
	//void �޼ҵ��� �������� �������� �ʰڴٴ� �ǹ�
	//String[] �迭�̶�� �ǹ� String 
	public static void main(String[] args) {
		int i=20;
		int s;
		char a;
		
		s=sum(i,10);
		a='?'; // ���� a �� �б� ���� �ʱ�ȭ ����
		System.out.println(a);
		System.out.println(s);
		System.out.println("hello");
		

	}

}
