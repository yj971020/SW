package ch03.Loop;

public class StringHash {
	public static void main(String[] args) {
		
		String a="exit";
		String b="exit";
		String c= new String("exit");
		String d= new String("exit");
		
		//hashcode ��� ���ǵ� ���� ������ ���� hashcode
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode()+"\n");
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b)); //a �� b �� �ؽ��ڵ��
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
	}
}
