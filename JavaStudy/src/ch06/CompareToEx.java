package ch06;

public class CompareToEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = "java";
		String cpp = "c++";

		int result = java.compareTo(cpp);
		if (result < 0) {
			System.out.println(java + " �� ���� ����");
		} else if (result == 0) {
			System.out.println("���� ����");
		} else {
			System.out.println(cpp + "�� ��������");
		}

		System.out.println("���������� ���� ������ ���ڴ�? " + (result< 0 ? java : cpp));
	}

}
