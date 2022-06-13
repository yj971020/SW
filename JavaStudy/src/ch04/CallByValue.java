package ch04;

import java.util.Arrays;

class Number{
	static int num=10;
}
public class CallByValue {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		increase(a);
		System.out.println(Arrays.toString(a));
		
	}
	static void increase(int m) {
		m=m+1;
	}
	
	static void increase(Circle m) {
		m.radius++;
	}
	
	static void increase(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]+=i;
		}
	}

}
