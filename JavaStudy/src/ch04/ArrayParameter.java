package ch04;

public class ArrayParameter {
	static int i=10;
	
	static void repalceSpace(char[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==' ') {
				a[i]=',';
			}
		}
		i=12;
		
	}
	
	static void printCharArray(char a[]) {
		for(int i=0;i<a.length;i++) 
			System.out.print(a[i]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		char a[]= {'t','h','i','s' ,' ', 'i','s'};
		printCharArray(a);
		repalceSpace(a);
		printCharArray(a);
		System.out.println(i);
	}
	
	}
