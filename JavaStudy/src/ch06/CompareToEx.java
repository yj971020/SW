package ch06;

public class CompareToEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = "java";
		String cpp = "c++";

		int result = java.compareTo(cpp);
		if (result < 0) {
			System.out.println(java + " 가 먼저 나옴");
		} else if (result == 0) {
			System.out.println("값이 같음");
		} else {
			System.out.println(cpp + "가 먼저나옴");
		}

		System.out.println("사전적으로 먼저 나오는 문자는? " + (result< 0 ? java : cpp));
	}

}
