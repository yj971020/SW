package ch03.HW;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] arr=new int[10];
		System.out.print("정수 10개 입력>> ");
		for ( int i=0;i<10;i++) {
			arr[i]=in.nextInt();
		}
		int temp=0;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
