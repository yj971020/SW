package ch07.ch01_collection_generic;

public class MyInterfaceMain {
	public static void main(String[] args) {
		
		//�������̽� ���������� �ڽ� Ŭ������ ��ü ����
		MyInterface mi=new MyInterClass();
		
		mi.method();  //mi.a
		
		//���� �������̽�  - ���⿡���� ���� ��������
		//���� �������̽��δ� ��ü ���� �Ұ�.
		MyInterface mi2=new MyInterface() {
			//�� �κ� ��ü�� ����� ���� ��
			int a=10;
			@Override
			public void method() {
			System.out.println("�����ǵ� �޼ҵ� mi2");
			}
		};
		
		mi2.method();
		//mi2.a -> ����. �ܺο��� a �� ���� �Ұ�
		//MyInterface �� ���������� �޾Ұ�, int a=0; �� �߰� �Ȱ�.
		//�θ� ���� �ʵ��̹Ƿ� ���� �Ұ� 
		
		MyInterface mi3=new MyInterface() {
			//�� �κ� ��ü�� ����� ���� ��
			int a=10;
			@Override
			public void method() {
			System.out.println("�����ǵ� �޼ҵ� mi3");
			}	
		};
		mi3.method();
	}
	//���ٽ�
	// = �� �������� Ÿ���� ���ƾ��� - > �׳� ������ �� ���� �ع���
	//�Ű������� �˸� �ǹǷ� �Լ��� ����
	MyInterface mi4=()->System.out.println("������ mi4");



}
