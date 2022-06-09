package ch03.Arrays;

public class ReturnArrayExam {
	
		static int[] makeArray() {
			int[] temp=new int[4];
			for (int i=0;i<temp.length;i++) {
				temp[i]=i+1;
			}
			return temp;
		}
		
		public static void main(String[] args) {
			int[] intArr=new int[4];
			intArr=makeArray();
			
		
		
		for (int k:intArr) {
			System.out.println(k+"\t");
		}
		}
		}
