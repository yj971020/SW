package ch07.ch01_collection_generic;

import java.util.Stack;

public class GStack<T> {
	int tos;
	Object[] stck;
	public GStack() {
		tos=0;
		stck=new Object[10];
	
}
	public void push(T item) {
		if(tos==10)
			return;
		stck[tos] = item;
		tos++;
	}
	
	public T pop() {
		if(tos==0)
			return null;
		tos--;
		return (T)stck[tos];
	}

}
