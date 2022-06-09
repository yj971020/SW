package ch03.Loop;

public class SwitchEx {
	public static void main(String[] args) {
		char grade='B';
		switch(grade) {
		case 'A':
			System.out.println("축하합니다");
			break;
		case 'B':
			System.out.println("좋아요");
			break;
		case 'C':
			System.out.println("분발해");
			break;
		}
		
		
		switch(grade) {
		case 'A':
			System.out.println("break 없을 때 A");
		case 'B':
			System.out.println("break 없을 때 B");
		case 'C':
			System.out.println("break 없을 때 C");
		}
		
		
	}
}
