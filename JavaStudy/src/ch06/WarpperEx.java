package ch06;

public class WarpperEx {
	public static void main(String[] args) {
		Integer i= Integer.valueOf(10);
		Double d= Double.valueOf(3.14);
		Boolean b=Boolean.valueOf(false);
		Float f=Float.valueOf(3.14f);
		
		System.out.println(i.toString());
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		System.out.println(f);
		
		int i1=i.intValue(); //기본타입으로
		double d1=d.doubleValue();
		boolean b1=b.booleanValue();
		
	}
}
