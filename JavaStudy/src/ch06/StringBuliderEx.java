package ch06;

public class StringBuliderEx {
	public static void main(String[] args) {
		
		//�̱۾����忡 ����
		//String buffer �� ��Ƽ�����忡 ����
		StringBuilder sb = new StringBuilder("This");
		
		sb.append(" is my ");
		sb.append("pencil ");
		System.out.println(sb.indexOf("my"));
		//8,10
		sb.replace(sb.indexOf("my"), sb.indexOf("my")+2,"your");
		System.out.println(sb);
	}

}
