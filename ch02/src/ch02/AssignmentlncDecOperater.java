package ch02;

public class AssignmentlncDecOperater {
	public static void main(String[] args) {
		int a=3,b=3,c=3;
		
		a+=3;
		b*=3;
		c%=2;
		
		int d=3;
		//증감연산자 사례
		a= d++;
		System.out.println("a= "+a+", "+"d="+d);
		a=++d;
		System.out.println("a= "+a+", "+"d="+d);
		a=d--;
		System.out.println("a= "+a+", "+"d="+d);
		a=--d;
		System.out.println("a= "+a+", "+"d="+d);
		
	}

}
