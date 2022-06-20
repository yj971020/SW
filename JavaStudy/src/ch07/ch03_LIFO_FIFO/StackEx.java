package ch07.ch03_LIFO_FIFO;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		//3,6,2,5,9
		stack.push(3); System.out.println(stack.peek()); //peek 은 맨 위에 읽기
		stack.push(6); System.out.println(stack.peek());
		stack.push(2); System.out.println(stack.peek());
		stack.push(5); System.out.println(stack.peek());
		stack.push(9); System.out.println(stack.peek());
		System.out.println("------------------------------");
		
		int result=stack.pop();
		System.out.println(result);  // 방금 빼낸 거 출력 
		System.out.println(stack.peek());  //현재 맨위에꺼 읽기 
	}

}
