package ch03.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum = 0, n = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">> ");
			
			try { // ���ܰ� �߻��� �� �ִ� �ڵ�
				n = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("������ �Է��ϼ���");
				in.next(); // ������ �ƴ� ��ū�� ��Ʈ������ ���ش�!!!!!
				i--; // �ε��� �������� �ʵ��� �̸� ����
			}
			sum += n;
		}
		System.out.println("����" + sum);
		in.close();
	}
}
