package ch07.ch03_LIFO_FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		
		queue.offer(3); System.out.println(queue.peek());
		queue.offer(6); System.out.println(queue.peek());
		queue.offer(2); System.out.println(queue.peek());
		queue.offer(5); System.out.println(queue.peek());
		queue.offer(9); System.out.println(queue.peek());
		
		System.out.println("------------------------------");
		
		int result=queue.poll();
		System.out.println(result);  // 방금 빼낸 거 출력 
		System.out.println(queue.peek());  //현재 맨위에꺼 읽기 
	}

}
