package ch04.ch2;

//������
public class Dog extends Animal{
	@Override
	void speak() { //signature - �޼ҵ�� : Ÿ�԰� �Ű����� Ÿ��. ��, ����
		
		System.out.println("������ �۸�");;
	}
	
	void speak(int a) {
		System.out.println(a+"�� �۸�");
	}
}
