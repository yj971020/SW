package ch03.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in);
				System.out.println("���� 3���� �Է��ϼ���");
				int sum=0,n=0;
				for(int i=0;i<3;i++) 
				
				try {  //���ܰ� �߻��� �� �ִ� �ڵ�
					
				
				
				
				//� ������ ������ ����, ( or ������ || �ƴ� | ��)
				}catch(ArithmeticException|InputMismatchException e) {  					System.out.println("�����߻�"+e.toString());
					
				}catch(Exception e) { //� �������� �𸣴� �ϴ� Exception ���� 
					System.out.println("�����߻�"+e.toString());
				}finally {
					System.out.println("�����߻�");
					in.close();
				}
	}

}
