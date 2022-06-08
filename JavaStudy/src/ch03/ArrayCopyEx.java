package ch03;

public class ArrayCopyEx {
	int[] myArr= {1,2,3,4};
	
	void myCalc() {
		myFunc(myArr);
		for ( int i=0;i<myArr.length;i++) {
			System.out.println(myArr[i]);
		}
	}
	int[] myFunc(int[] arr) {
		arr[2]=9;
		return arr;
	}
	
	public static void main(String[] args) {
		ArrayCopyEx ex=new ArrayCopyEx();
		ex.myCalc();
	}

}
