package ch06;

public class StringEx {
	public static void main(String[] args) {
		String a=new String("c#");
		String b = new String(",c++    ");
		
		System.out.println(a.contains("#"));
		
		a=a.concat(b); //���ڿ� ����
		System.out.println(a);
		https://www.naver.com/
		a=a.trim();  //�� �� ���� ����
		System.out.println(a);
		
		a=a.replace("c#","java" );//���ڿ� ��ġ
		System.out.println(a);
		
		String s[]=a.split(",");
		
		a=a.substring(5); //�ε��� 5���� ������ ���� ��Ʈ�� ����
		System.out.println(a+" a.substring(5)");
		
		//indexOf()
		System.out.println(a.indexOf("+")); // ������ �ε���, ������ -1 ����
		char c=a.charAt(2);
		System.out.println(c);
		
	}

}
