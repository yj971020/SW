package ch06;

public class StringBuliderEx {
	public static void main(String[] args) {
		
		//싱글쓰레드에 적합
		//String buffer 는 멀티쓰레드에 적합
		StringBuilder sb = new StringBuilder("This");
		
		sb.append(" is my ");
		sb.append("pencil ");
		System.out.println(sb.indexOf("my"));
		//8,10
		sb.replace(sb.indexOf("my"), sb.indexOf("my")+2,"your");
		System.out.println(sb);
	}

}
