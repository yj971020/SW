package ch06;

public class StringBufferEx {
	public static void main(String[] args) {
		String s="This ";
		s=s+"is my "; //This is my
		s=s+"pencil";	//This is my Pencil
		s=s.replace("my", "your"); //This is your pencil
		//s�� �������־�� ��
		//���� �޸� ������ 4�� (String �� ���� �Ұ�. ���� �������)
		
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
