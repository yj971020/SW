package ch06;

public class StringBufferEx {
	public static void main(String[] args) {
		String s="This ";
		s=s+"is my "; //This is my
		s=s+"pencil";	//This is my Pencil
		s=s.replace("my", "your"); //This is your pencil
		//s에 저장해주어야 함
		//사용된 메모리 구조는 4개 (String 은 수정 불가. 새로 만들어짐)
		
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is my ");
		sb.append("pencil ");
		System.out.println(sb.indexOf("my"));
		//8,10
		sb.replace(sb.indexOf("my"), sb.indexOf("my")+2,"your");
		System.out.println(sb);
	}

}
