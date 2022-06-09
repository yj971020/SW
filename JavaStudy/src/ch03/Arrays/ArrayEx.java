package ch03.Arrays;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		//로컬 선언과 동시에 배열객체 생성하여 초기화
		int[] arr=new int[10];
		
		//배열 참조변수 선언
		int intarr2[];
		intarr2= new int[3]; //배열객체 생성하여 로컬변수에 대입
		
		//배열의 타입이 초기값으로 배열의 각 요소들이 초기화.
		String[] strarr= new String[5];
		
		System.out.println(Arrays.toString(strarr));
	}

}
