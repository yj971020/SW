package ch07.ch01_collection_generic;

//�Լ��� �������̽�
//�ȿ� �߻�޼ҵ��� ������ 1������ �ϴ� �������̽�
@FunctionalInterface   //������̼� ���� ����- �����Ͻ� üŷ��.
//���� �ȿ� �߻�޼ҵ尡 1�� �̻��̸� ���� �� ( �Լ��� �������̽��� �ƴϱ� ����)
public interface MyInterface {
	void method();		
	}

class MyInterClass implements MyInterface
{
	int a=10;

	@Override
	public void method() {
		System.out.println("�����ǵ� �޼ҵ�");
	}

	
}

