package ch04.ch03_constructor;

public class A {
	//A() ����Ʈ ������
}

class B {
	//����Ʈ ������
	B() {
		System.out.println("B������");
	}
}
class C{
	int age;
	C(){
		this("hello");//this() �� �ٸ� �����ڸ� ȣ���ϴ� �޼ҵ�
	}
	
	C(String msg){ //C(String) �Ű����� �ִ� ������ ( �Ϲݻ�����)
		System.out.println(msg);
	}
	C(int a){this.age=a;}  //���� �ν��Ͻ����� �ڽ��� ���������� ǥ�� 
	//���� Ŭ���� �� X (Ŭ����: ���赵)
	C(int a,double d){}
	C(double d,int a){}  //�Ű����� �޴� ������ �޶� �����ε� ����
}
