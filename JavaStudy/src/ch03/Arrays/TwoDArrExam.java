package ch03.Arrays;

public class TwoDArrExam {
	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		int[][] intArr=new int[2][3];
		intArr= new int[][] {{23,34,4},{1,2,3}};
		
		for( int i=0;i<arr.length;i++) {
			for ( int j=0; j< arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		
		
	}
}
