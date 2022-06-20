package ch07.ch03_LIFO_FIFO;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue_Ex {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		//3,6,2,5,9
		stack.push(3); System.out.println(stack.peek()); //peek �� �� ���� �б�
		stack.push(6); System.out.println(stack.peek());
		stack.push(2); System.out.println(stack.peek());
		stack.push(5); System.out.println(stack.peek());
		stack.push(9); System.out.println(stack.peek());
		System.out.println("------------------------------");
		
		int stack_result=stack.pop();
		System.out.println(stack_result);  // ��� ���� �� ��� 
		System.out.println(stack.peek());  //���� �������� �б� 
		
		System.out.println("------------------------------����");
		
		Queue<Integer> queue=new LinkedList<Integer>();
		
		queue.offer(3); System.out.println(queue.peek());
		queue.offer(6); System.out.println(queue.peek());
		queue.offer(2); System.out.println(queue.peek());
		queue.offer(5); System.out.println(queue.peek());
		queue.offer(9); System.out.println(queue.peek());
		
		System.out.println("------------------------------");
		
		int result=queue.poll();
		System.out.println(result);  // ��� ���� �� ��� 
		System.out.println(queue.peek());  //���� �������� �б� 
		System.out.println("------------------------------ť");
	}
	}

