package ch03;

public class ForEachExam {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		for(int k:arr) {
			System.out.println(k);
		}
		
		double[] arr2= {0.1,0.2,0.3,9.9};
		
		for(double d: arr2) {
			System.out.println(d);
		}
		
		int[] arr3= {1,2,3,4,5};
		int sum=0;
		for(int i:arr3) {
			sum+=i;
		}
		System.out.println(sum);
		

	}

}
