package ch03.Loop;

public class StringHash {
	public static void main(String[] args) {
		
		String a="exit";
		String b="exit";
		String c= new String("exit");
		String d= new String("exit");
		
		//hashcode 라면 정의된 값이 같으면 같은 hashcode
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode()+"\n");
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b)); //a 와 b 는 해시코드와
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
	}
}
