package ch12;

public class ThreadMainEx {
	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		long id= Thread.currentThread().getId();
		int priority=Thread.currentThread().getPriority();
		Thread.State s= Thread.currentThread().getState();
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(priority);
		System.out.println(s);
	}

}
