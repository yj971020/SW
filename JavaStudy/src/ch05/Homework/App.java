package ch05.Homework;

import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	abstract protected int calc();
	
	protected void input() {
		Scanner in= new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ���>> ");
		a=in.nextInt();
		b=in.nextInt();
	}
	
	public void run() {
		input();
		int res=calc();
		System.out.println("���� ���� "+ res);
	}
	
}
class Adder extends Calculator{

	@Override
	protected int calc() {
		return a+b;
			
	}
	
}

class Subtracter extends Calculator{

	@Override
	protected int calc() {
		return a-b;
	}
}

public class App {
	public static void main(String[] args) {
		Adder adder= new Adder();
		Subtracter sub= new Subtracter();
		
		adder.run();
		sub.run();
	}
	

}
