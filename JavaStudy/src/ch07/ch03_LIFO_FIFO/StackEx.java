package ch07.ch03_LIFO_FIFO;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		//3,6,2,5,9
		stack.push(3); System.out.println(stack.peek()); //peek �� �� ���� �б�
		stack.push(6); System.out.println(stack.peek());
		stack.push(2); System.out.println(stack.peek());
		stack.push(5); System.out.println(stack.peek());
		stack.push(9); System.out.println(stack.peek());
		System.out.println("------------------------------");
		
		int result=stack.pop();
		System.out.println(result);  // ��� ���� �� ��� 
		System.out.println(stack.peek());  //���� �������� �б� 
	}

}
