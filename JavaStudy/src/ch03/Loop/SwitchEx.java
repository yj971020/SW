package ch03.Loop;

public class SwitchEx {
	public static void main(String[] args) {
		char grade='B';
		switch(grade) {
		case 'A':
			System.out.println("�����մϴ�");
			break;
		case 'B':
			System.out.println("���ƿ�");
			break;
		case 'C':
			System.out.println("�й���");
			break;
		}
		
		
		switch(grade) {
		case 'A':
			System.out.println("break ���� �� A");
		case 'B':
			System.out.println("break ���� �� B");
		case 'C':
			System.out.println("break ���� �� C");
		}
		
		
	}
}
