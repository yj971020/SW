package ch03.Arrays;

public class ArrayMinMaxExam {
	public static void main(String[] args) {
		
		int[] intarr= {60,35,20,70,55,100};
		int max=0;
		
		for(int i=0;i<intarr.length;i++) {
			if (max<intarr[i]) {
				max=intarr[i];
			}
		}
		
		System.out.println(max);
	}

}
