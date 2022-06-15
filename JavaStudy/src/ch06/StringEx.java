package ch06;

public class StringEx {
	public static void main(String[] args) {
		String a=new String("c#");
		String b = new String(",c++    ");
		
		System.out.println(a.contains("#"));
		
		a=a.concat(b); //문자열 연결
		System.out.println(a);
		https://www.naver.com/
		a=a.trim();  //앞 뒤 공백 제거
		System.out.println(a);
		
		a=a.replace("c#","java" );//문자열 대치
		System.out.println(a);
		
		String s[]=a.split(",");
		
		a=a.substring(5); //인덱스 5부터 끝까지 서브 스트링 리턴
		System.out.println(a+" a.substring(5)");
		
		//indexOf()
		System.out.println(a.indexOf("+")); // 있으면 인덱스, 없으면 -1 리턴
		char c=a.charAt(2);
		System.out.println(c);
		
	}

}
