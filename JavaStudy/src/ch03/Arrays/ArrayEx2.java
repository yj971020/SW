package ch03.Arrays;

import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] intArr=new int[5];
		int[] myarr= intArr; // ���� ���� : ������ ����
		// ps ���� ����� ��ü�� ���� ����°�
		
		for (int i=0;i<5;i++) {
			intArr[i]=i;
		}
		
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(myarr)); 
		
		myarr[1]=3;
		//���� ����
		System.out.println(Arrays.toString(Arrays.copyOf(myarr, 3)));
	}

}
