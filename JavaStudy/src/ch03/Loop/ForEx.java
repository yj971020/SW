package ch03.Loop;

public class ForEx {
	public static void main(String[] args) {
		int i=0;
		for(;;) {
			System.out.println(i);
			if(i==10) break;
			i++;
		}
	}
}
